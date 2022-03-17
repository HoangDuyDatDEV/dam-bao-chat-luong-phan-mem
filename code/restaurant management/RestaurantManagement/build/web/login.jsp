<%-- 
    Document   : login
    Created on : Jan 2, 2022, 8:29:57 PM
    Author     : dotav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
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
        <section class="vh-100" style="background-color: #508bfc;">
            <div class="container py-5 h-100">
              <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                  <div class="card shadow-2-strong" style="border-radius: 1rem;">
                    <div class="card-body p-5 text-center">
                      <h3 class="mb-5">Sign in</h3>
                        <form action = "ControlLogin" method = "post">
                          <div class="form-outline mb-4">
                              <input type="text" id="typeEmailX-2" class="form-control form-control-lg" name="username" />
                          </div>
                          <div class="form-outline mb-4">
                              <input type="password" id="typePasswordX-2" class="form-control form-control-lg" name="password" />
                          </div>
                            <!-- Checkbox -->
                          <div class="form-check d-flex justify-content-start mb-4">
                            <input class="form-check-input" type="checkbox" value="" id="form1Example3" />
                            <label class="form-check-label" for="form1Example3"> Remember password </label>
                          </div>
                          <button class="btn btn-primary btn-lg btn-block" type="submit">Login</button>
                        </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
    </body>
</html>
