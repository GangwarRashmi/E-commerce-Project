<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMIN PANEL</title>
        <!-- Include Bootstrap CSS -->
        <%@include file="components/common_css_js.jsp" %>


    </head>
    <body>
        <%@include file= "components/navbar.jsp" %>


        <div class="container mt-3">
            <h1>welcome to admin page</h1>
            <div class="row">
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body text-center">
                            <img src="components/images/icons8-user-48.png" alt="user icon">
                            <h3>User</h3>
                            <h3>78</h3>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body text-center">
                            <img src="components/images/icons8-category-48.png" alt="category icon">

                            <h3>Category</h3>
                            <h3>67</h3>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body text-center">
                            <img src="components/images/icons8-product-50.png" alt="product icon">

                            <h3>Product</h3>
                            <h3>322</h3>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row mt-5">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body text-center">                            
                            <img src="components/images/icons8-add-94.png" alt="add category icon">

                            <h2>add new product</h2>
                        </div>
                    </div>
                </div>

                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body text-center">
                            <img src="components/images/icons8-hand-64.png" alt="hand icon">

                            <h2>add new category</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
