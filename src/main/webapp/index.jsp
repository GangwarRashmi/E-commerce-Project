<%-- 
    Document   : index
    Created on : Oct 30, 2023, 2:00:02 AM
    Author     : Rashmi Gangwar
--%>

<%@page import="com.learn.mycart.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Creation session factory object</h1>
        
        <% 
         out.println(FactoryProvider.getFactory());
         
        %>
    </body>
</html>
