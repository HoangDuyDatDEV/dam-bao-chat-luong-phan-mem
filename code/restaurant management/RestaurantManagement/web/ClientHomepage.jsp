<%-- 
    Document   : ClientHomepage
    Created on : Jan 2, 2022, 8:26:09 PM
    Author     : dotav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>  
        body {
            background-image: url('A_cup.jpg');
            background-repeat: no-repeat;
             background-attachment: fixed;
            background-size: 100% 100%;
        }
        </style>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/39e8541ce6.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="src/css/styles.css">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
            <a class="navbar-brand" href="Home.html">
              <img src="https://image.flaticon.com/icons/png/512/69/69524.png" style="width:42px;height:42px;">
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
              <ul class="navbar-nav ">
                <li class="nav-item">
                  <a class="nav-link" href="BookTableOnline.jsp">Đặt bàn online</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="Contact.html">Đặt món online</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Xin chào</a>
                </li>    
              </ul>
              <ul class = "navbar-nav ml-auto">
                <li>
                    <button type="button" class="btn btn-info btn-round" data-toggle="modal" data-target="#loginModal">
                      Login
                    </button>
                </li>
              </ul>
            </div>  
          </nav>
    </body>
</html>
