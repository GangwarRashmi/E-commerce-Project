
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New User</title>
        <%@include file="components/common_css_js.jsp" %>
    </head>
    <body>
        <%@include file= "components/navbar.jsp" %>
        <div class="container-fluid">
            <div class="row mt-5">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body px-5">
                            <h3 class="text-center my-3">Sign up</h3>
                            <form action="RegisterServlet" method="post">

                                <div class="form-group">
                                    <label for="name">User Name</label>
                                    <input name="user_name" type="text" class="form-control" id="name" placeholder="Name" aria-describedby="name">

                                </div>
                                <div class="form-group">
                                    <label for="email">User Email</label>
                                    <input name="user_email" type="email" class="form-control" id="email" placeholder="Email" aria-describedby="email">

                                </div>
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <input name="user_password" type="password" class="form-control" id="password" placeholder="Password" aria-describedby="password">

                                </div>
                                <div class="form-group">
                                    <label for="phone">Phone No.</label>
                                    <input name = "user_phone" type="number" class="form-control" id="phone" placeholder="Phone number" aria-describedby="phone">

                                </div>
                                <div class="form-group">
                                    <label for="address">Address</label>
                                    <textarea name ="user_address"  style="height:200px" class="form-control" placdeholder="Enter your Address" aria-describedby="address">
                               
                                    </textarea>

                                </div>
                                <div class="container text-center">
                                    <button type="register" class="btn btn-primary">Register</button>
                                    <button type="reset" class="btn btn-outline-warning">Reset</button>
                                </div>
                            </form>


                        </div>
                    </div>
                </div>
            </div>


    </body>
</html>
