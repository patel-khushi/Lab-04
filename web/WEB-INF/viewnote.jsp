<%-- 
    Document   : viewnote
    Created on : Oct 7, 2022, 12:57:16 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note Page</title>
    </head>
    <body>
        <div>
            <h1>Note Keeper</h1>
            <h2>View Note</h2>
        </div>
        
        <div>
            <label> <b>Title: </b></label>
            <p>${view.title}</p>
            
            <label> <b>Contents:</b> </label>
            <p>${view.content}</p>
        </div>
        <div>
            <a href="note?edit">Edit</a>
        </div>
    </body>
</html>
