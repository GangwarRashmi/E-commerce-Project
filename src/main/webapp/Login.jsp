<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <%@include file="components/common_css_js.jsp" %>


    </head>
    <body>

        <%@include file= "components/navbar.jsp" %>

        <div class="container" >
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="card mt-5">
                        <div class="card-header text-center">
                            <h3>Login</h3>

                        </div>

                        <div class="card-body">
                            <form>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">

                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">


                                </div>
                                <div class="container text-center">

                                    <button type="submit" class="btn btn-primary">Submit</button>
                                    <button type="reset" class="btn btn-outline-warning">Reset</button>
                                </div>

                            </form>

                        </div>

                    </div>

                </div>

            </div>

        </div>
    </body>
</html>
