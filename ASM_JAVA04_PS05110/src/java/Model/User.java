/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author Admin
 */
public class User implements Serializable {

    private String username;
    private String password;
    private boolean roles;
    private String firtname;
    private String lastname;
    private String Email;
    private String Image;

    public User() {
    }

    public User(String username, String password, boolean roles, String firtname, String lastname, String Email, String Image) {
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.firtname = firtname;
        this.lastname = lastname;
        this.Email = Email;
        this.Image = Image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRoles() {
        return roles;
    }

    public void setRoles(boolean roles) {
        this.roles = roles;
    }

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public boolean checkLogin(String username, String password) {
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Select * from Registration where username = ? and password = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            boolean result = rs.next();
            rs.close();
            stm.close();
            con.close();
            if (result) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insert(String username, String password, boolean Roles, String firstname, String lastname, String email, String photo) {
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Insert Into Registration(username,password,isAdmin,firstname,lastname,Email,photo)" + "Values(?,?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setBoolean(3,Roles);
            stm.setString(4, firstname);
            stm.setString(5, lastname);
            stm.setString(6, email);
            stm.setString(7, photo);

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

    public boolean update() {
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Update Registration Set password = ?, isAdmin = ?, firstname = ?, lastname = ?, Email = ?, photo = ? Where username = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, password);
            stm.setBoolean(2, roles);
            stm.setString(3, firtname);
            stm.setString(4, lastname);
            stm.setString(5, Email);
            stm.setString(6, Image);
            stm.setString(7, username);

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

    public List<User> showdata() {
        List<User> user = null;
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Select * from Registration";
            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery(sql);
            user = new ArrayList<User>();
            while (rs.next()) {
                User us = new User();
                us.setUsername(rs.getString("username"));
                us.setPassword(rs.getString("password"));
                us.setRoles(rs.getBoolean("isAdmin"));
                us.setFirtname(rs.getString("firstname"));
                us.setLastname(rs.getString("lastname"));
                us.setEmail(rs.getString("Email"));
                user.add(us);
            }

            rs.close();
            stm.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public User show(String username) {
        User us = null;
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Select * from Registration where username=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                us = new User();
                us.setUsername(rs.getString("username"));
                us.setPassword(rs.getString("password"));
                us.setRoles(rs.getBoolean("isAdmin"));
                us.setFirtname(rs.getString("firstname"));
                us.setLastname(rs.getString("lastname"));
                us.setEmail(rs.getString("Email"));
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    }

    public boolean deleteUser() {
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("DBConnect");
            Connection con = ds.getConnection();

            String sql = "Delete from Registration Where username=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
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

}
