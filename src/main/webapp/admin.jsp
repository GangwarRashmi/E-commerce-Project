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


        <div class="container admin">
            <div class="row mt-5">
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body text-center">
                            <img style="max-width: 125px;"class="img-fluid rounded-circle" src="components/images/icons8-user-48.png" alt="user icon">
                            <h3 class="text-uppercase text-muted">User</h3>
                            <h3>78</h3>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body text-center">
                            <img style="max-width: 125px;"class="img-fluid rounded-circle" src="components/images/icons8-category-48.png" alt="category icon">

                            <h3 class="text-uppercase text-muted">Category</h3>
                            <h3>67</h3>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body text-center">
                            <img style="max-width: 125px;"class="img-fluid rounded-circle" src="components/images/icons8-product-50.png" alt="product icon">

                            <h3 class="text-uppercase text-muted">Product</h3>
                            <h3>322</h3>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row mt-5">


                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body text-center" data-toggle="modal" data-target="#add-category-modal">
                            <img style="max-width: 100px;" class="img-fluid rounded-circle " src="components/images/PLUS.png" alt="hand icon">
                            <P class="mt-2">CLICK HER TO ADD NEW PRODUCT</P>
                            <h3 class="text-uppercase text-muted">add new category</h3>
                        </div>
                    </div>
                </div>


                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body text-center" data-toggle="modal" data-target="#add-product-modal">                            
                            <img style="max-width: 100px;"class="img-fluid rounded-circle" src="components/images/cate.jpeg" alt="add category icon">
                            <p class="mt-2">CLICK HERE TO ADD NEW CATEGORY</p>
                            <h2 class="text-uppercase text-muted">add new product</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>



        <!-- Modal for category -->
        <div class="modal fade" id="add-category-modal" tabindex="-1" role="dialog" aria-labelledby="categoryModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header custombg text-white" >
                        <h5 class="modal-title" id="categoryModalLabel">Fill category details!!</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="ProductOperationServlet" method="post">

                            <input type="hidden" name="operation" value="addcategory">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Enter  Category Title" name="catTitle" required/>

                            </div>
                            <div class="form-group">
                                <input type="textarea" style="height:100px" class="form-control" placeholder="Enter category description" name="catDescription" required/>


                            </div>
                            <div class="container text-center">
                                <button type="submit" class="btn btn-outline-success">Add Category</button>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>

        <!--nodal for Product-->

        <div class="modal fade" id="add-product-modal" tabindex="-1" role="dialog" aria-labelledby="productModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header custombg text-white" >
                        <h5 class="modal-title" id="productModalLabel">Add Product Details</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="ProductOperationServlet" method="post">

                            <input type="hidden" name="operation" value="addproduct">
                            <div class="form-group">
                                <label for="productName">Name:</label>
                                <input type="text" class="form-control" id="productName" readonly>
                            </div>
                            <div class="form-group">
                                <label for="productDescription">Description:</label>
                                <textarea class="form-control" id="productDescription" readonly></textarea>
                            </div>
                            <div class="form-group">
                                <label for="productPrice">Price:</label>
                                <input type="text" class="form-control" id="productPrice" readonly>
                            </div>
                            <div class="form-group">
                                <label for="productFile">Upload File:</label>
                                <input type="file" class="form-control-file" id="productFile" name="productFile">
                            </div>
                            <div class="container text-center">
                                <button type="button" class="btn btn-outline-success">Add Product</button>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
    </body>
</html>
