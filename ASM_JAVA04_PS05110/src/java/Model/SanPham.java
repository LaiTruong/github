/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Admin
 */
public class SanPham {

    String id;
    String Tensp;
    String Giamoi;
    String Giacu;
    String image;
    String Mota;

    public SanPham() {
    }

    public SanPham(String id, String Tensp, String Giamoi, String Giacu, String image, String Mota) {
        this.id = id;
        this.Tensp = Tensp;
        this.Giamoi = Giamoi;
        this.Giacu = Giacu;
        this.image = image;
        this.Mota = Mota;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getGiamoi() {
        return Giamoi;
    }

    public void setGiamoi(String Giamoi) {
        this.Giamoi = Giamoi;
    }

    public String getGiacu() {
        return Giacu;
    }

    public void setGiacu(String Giacu) {
        this.Giacu = Giacu;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public SanPham[] showsp() throws NamingException {
        ArrayList list = new ArrayList();
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            Statement st = con.createStatement();
            String s = "select * from SanPham";
            ResultSet rs = st.executeQuery(s);
            while (rs.next()) {
                id = rs.getString(1);
                Tensp = rs.getString(2);
                Giamoi = rs.getString(3);
                Giacu = rs.getString(4);
                image = rs.getString(5);
                Mota = rs.getString(6);

                SanPham sp = new SanPham(id, Tensp, Giamoi, Giacu, image, Mota);
                list.add(sp);

            }
        } catch (Exception e) {

        }
        SanPham[] sp = new SanPham[list.size()];
        list.toArray(sp);
        return sp;
    }

    public List<SanPham> showProduct() {
        List<SanPham> sanpham = null;
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Select * from SanPham";
            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery(sql);
            sanpham = new ArrayList<SanPham>();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setId(rs.getString("id"));
                sp.setTensp(rs.getString("Tensp"));
                sp.setGiamoi(rs.getString("Giamoi"));
                sp.setGiacu(rs.getString("Giacu"));
                sp.setImage(rs.getString("image"));
                sp.setMota(rs.getString("Mota"));

                sanpham.add(sp);
            }

            rs.close();
            stm.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sanpham;
    }

    public SanPham showdata(String Id) {
        SanPham sp = null;
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Select * from SanPham where id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                sp = new SanPham();
                sp.setId(rs.getString("id"));
                sp.setTensp(rs.getString("Tensp"));
                sp.setGiamoi(rs.getString("Giamoi"));
                sp.setGiacu(rs.getString("Giacu"));
                sp.setImage(rs.getString("image"));
                sp.setMota(rs.getString("Mota"));

            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sp;
    }

    public boolean insertsp(String id, String Tensp, String Giamoi, String Giacu, String image, String Mota) {
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Insert into SanPham(id,Tensp,Giamoi,Giacu,image,Mota)" + "Values(?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, id);
            stm.setString(1, Tensp);
            stm.setString(2, Giamoi);
            stm.setString(3, Giacu);
            stm.setString(4, image);
            stm.setString(5, Mota);

            int result = stm.executeUpdate();

            stm.close();
            con.close();

            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateProduct() {
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Update SanPham Set Tensp = ?, Giamoi = ?, Giacu = ?, image = ?, Mota = ? Where id = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, Tensp);
            stm.setString(2, Giamoi);
            stm.setString(3, Giacu);
            stm.setString(4, image);
            stm.setString(5, Mota);
            stm.setString(6, id);

            int result = stm.executeUpdate();
            stm.close();
            con.close();
            if (result > 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
