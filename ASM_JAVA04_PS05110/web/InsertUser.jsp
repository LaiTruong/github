<%-- 
    Document   : UpdateUser
    Created on : Jul 3, 2017, 1:48:34 PM
    Author     : Admin
--%>

<%-- 
    Document   : LG
    Created on : Jul 1, 2017, 5:14:40 PM
    Author     : Admin
--%>

<%-- 
    Document   : index
    Created on : Jun 6, 2017, 5:55:12 PM
    Author     : Admin
--%>

<%@page import="Model.SanPham"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
        ustora by freshdesignweb.com
        Twitter: https://twitter.com/freshdesignweb
        URL: https://www.freshdesignweb.com/ustora/
-->
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Ustora Laitbps05110</title>

        <!-- Google Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Font Awesome -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/responsive.css">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!---Login format--->
        <!-- styles -->
        <link href='http://fonts.googleapis.com/css?family=Droid+Serif' rel='stylesheet' type='text/css' />
        <link href='http://fonts.googleapis.com/css?family=Ubuntu' rel='stylesheet' type='text/css' />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,800,700,300' rel='stylesheet' type='text/css'>
        <link href="./assets/template1/assets/css/bootstrap.css" rel="stylesheet">
        <link href="./assets/template1/assets/css/bootstrap-responsive.css" rel="stylesheet">
        <link href="./assets/template1/assets/css/docs.css" rel="stylesheet">
        <link href="./assets/template1/assets/js/google-code-prettify/prettify.css" rel="stylesheet">
        <link href="./assets/template1/assets/css/style.css" rel="stylesheet">
        <link rel="stylesheet" href="./assets/template1/assets/css/flexslider.css" type="text/css" media="screen" />
        <link rel="stylesheet" type="text/css" href="./assets/template1/fancybox/jquery.fancybox-1.3.4.css" media="screen" />

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
              <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
            <![endif]-->

        <!-- fav and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.html">

        <!---End Login format--->

    </head>
    <body>

        <div class="header-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="user-menu">
                            <ul>
                                <li><a href="Login.jsp"><i class="fa fa-user"></i> My Account</a></li>
                                <li><a href="#"><i class="fa fa-heart"></i> Wishlist</a></li>
                                <li><a href="cart.jsp"><i class="fa fa-user"></i> My Cart</a></li>
                                <li><a href="checkout.jsp"><i class="fa fa-user"></i> Checkout</a></li>
                                <li><a href="Login.jsp"><i class="fa fa-user"></i> Login</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="header-right">
                            <ul class="list-unstyled list-inline">
                                <li class="dropdown dropdown-small">
                                    <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">currency :</span><span class="value">USD </span><b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">USD</a></li>
                                        <li><a href="#">INR</a></li>
                                        <li><a href="#">GBP</a></li>
                                    </ul>
                                </li>

                                <li class="dropdown dropdown-small">
                                    <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">language :</span><span class="value">English </span><b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">English</a></li>
                                        <li><a href="#">French</a></li>
                                        <li><a href="#">German</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- End header area -->

        <div class="site-branding-area">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="logo">
                            <h1><a href="./"><img src="img/logo.png"></a></h1>
                        </div>
                    </div>

                    <div class="col-sm-6">
                        <div class="shopping-item">
                            <a href="cart.html">Cart - <span class="cart-amunt">$100</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">5</span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- End site branding area -->

        <div class="mainmenu-area">
            <div class="container">
                <div class="row">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div> 
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="index.jsp">Home</a></li>
                            <li><a href="shop.jsp">Shop page</a></li>
                            <li><a href="single-product.jsp">Single product</a></li>
                            <li><a href="cart.jsp">Cart</a></li>
                            <li><a href="checkout.jsp">Checkout</a></li>
                            <li><a href="#">Category</a></li>
                            <li><a href="#">Others</a></li>
                            <li><a href="#">Contact</a></li>
                        </ul>
                    </div>  
                </div>
            </div>
        </div> <!-- End mainmenu area -->

        <!-- Header End -->
        <div id="maincontainer">
            <section id="login">
                <div class="container">
                    <ul class="breadcrumb">
                        <li>
                            <a href="#">Home</a>
                            <span class="divider">/</span>
                        </li>
                        <li>
                            <a href="#">Account</a>
                            <span class="divider">/</span>
                        </li>
                        <li class="active">Register Account</li>
                    </ul>
                    <div class="row">

                        <!-- Account Login-->
                        <div class="span9" style="float: left">
                            <h1 class="headingmain"><span>Register Account</span></h1>
                            <p> If you already have an account with us, please login at the login page.</p>
                            <br>
                            <form action="Controller" method="post">
                                User Name:<br><input type="text" name="txtUser" value="<%= request.getAttribute("username")%>"><br>
                                Password:<br><input type="password" name="txtPass" value="<%= request.getAttribute("password")%>"><br>
                                <%
                                    boolean roles = (boolean) request.getAttribute("Roles");
                                    if (roles == false) {


                                %>
                                Roles:<br><input type="checkbox" name="ckAdmin" value="<%= request.getAttribute("Roles")%>" /><br>
                                <%
                                } else {
                                %>
                                Roles:<br><input type="checkbox" name="ckAdmin" value="<%= request.getAttribute("Roles")%>" checked><br>
                                <%
                                    }
                                %>
                                Fist Name:<br><input type="text" name="txtfirstname" value="<%= request.getAttribute("Firstname")%>"><br>
                                Last Name:<br><input type="text" name="txtlastname" value="<%= request.getAttribute("Lastname")%>"><br>
                                E-Mail:<br><input type="text" name="txtemail" value="<%= request.getAttribute("Email")%>"><br>
                                Photo:<br><input type="text" name="txtphoto"><br><br>
                                <input class="btn btn-success" type="submit" value="Creat new account" name="btnAction" />
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <div class="footer-top-area">
            <div class="zigzag-bottom"></div>
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <div class="footer-about-us">
                            <h2>u<span>Stora</span></h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>
                            <div class="footer-social">
                                <a href="#" target="_blank"><i class="fa fa-facebook"></i></a>
                                <a href="#" target="_blank"><i class="fa fa-twitter"></i></a>
                                <a href="#" target="_blank"><i class="fa fa-youtube"></i></a>
                                <a href="#" target="_blank"><i class="fa fa-linkedin"></i></a>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-menu">
                            <h2 class="footer-wid-title">User Navigation </h2>
                            <ul>
                                <li><a href="#">My account</a></li>
                                <li><a href="#">Order history</a></li>
                                <li><a href="#">Wishlist</a></li>
                                <li><a href="#">Vendor contact</a></li>
                                <li><a href="#">Front page</a></li>
                            </ul>                        
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-menu">
                            <h2 class="footer-wid-title">Categories</h2>
                            <ul>
                                <li><a href="#">Mobile Phone</a></li>
                                <li><a href="#">Home accesseries</a></li>
                                <li><a href="#">LED TV</a></li>
                                <li><a href="#">Computer</a></li>
                                <li><a href="#">Gadets</a></li>
                            </ul>                        
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-newsletter">
                            <h2 class="footer-wid-title">Newsletter</h2>
                            <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>
                            <div class="newsletter-form">
                                <form action="#">
                                    <input type="email" placeholder="Type your email">
                                    <input type="submit" value="Subscribe">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- End footer top area -->

        <div class="footer-bottom-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="copyright">
                            <p>&copy; 2017 LaiTruong. All Rights Reserved. <a http://www.freshdesignweb.com" target="_blank">LaiTruongDesignweb.com</a></p>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="footer-card-icon">
                            <i class="fa fa-cc-discover"></i>
                            <i class="fa fa-cc-mastercard"></i>
                            <i class="fa fa-cc-paypal"></i>
                            <i class="fa fa-cc-visa"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- End footer bottom area -->

        <!-- Latest jQuery form server -->
        <script src="https://code.jquery.com/jquery.min.js"></script>

        <!-- Bootstrap JS form CDN -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

        <!-- jQuery sticky menu -->
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.sticky.js"></script>

        <!-- jQuery easing -->
        <script src="js/jquery.easing.1.3.min.js"></script>

        <!-- Main Script -->
        <script src="js/main.js"></script>

        <!-- Slider -->
        <script type="text/javascript" src="js/bxslider.min.js"></script>
        <script type="text/javascript" src="js/script.slider.js"></script>


        <!-- javascript
    ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="./assets/template1/assets/js/jquery.js"></script>
        <script src="./assets/template1/assets/js/google-code-prettify/prettify.js"></script>
        <script src="./assets/template1/assets/js/respond.min.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-transition.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-alert.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-modal.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-dropdown.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-scrollspy.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-tab.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-tooltip.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-popover.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-button.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-collapse.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-carousel.js"></script>
        <script src="./assets/template1/assets/js/bootstrap-typeahead.js"></script>
        <script src="./assets/template1/assets/js/application.js"></script>
        <script defer src="./assets/template1/assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="./assets/template1/assets/js/jquery.tweet.js"></script>
        <script src="./assets/template1/assets/js/jflickrfeed.min.js"></script>
        <script  src="./assets/template1/assets/js/cloud-zoom.1.0.2.js"></script>
        <script  src="./assets/template1/assets/jscloud-zoom.1.0.2.min.html"></script>
        <script type="text/javascript" src="./assets/template1/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
        <script  type="text/javascript" src="./assets/template1/assets/js/jquery.validate.js"></script>
        <script defer src="./assets/template1/assets/js/custom.js"></script>

    </body>
</html>


