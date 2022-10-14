<%-- 
    Document   : editnote
    Created on : Oct 7, 2022, 12:58:43 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note Page</title>
    </head>
    <body>
        <h1>Note Keeper</h1>
        <h2>Edit Note</h2>
        
        <form method="POST" action="note">         
            
            <table>
                <tr>
                    <td>
                        <label><b>Title: </b></label>
                    </td>
                    <td>
                        <input type="text" name="Title" value="${view.title}">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label><b>Content: </b></label>
                    </td>
                    <td>
                        <input type="text" name="Content" value="${view.content}">
                    </td>
                </tr>
            </table>
            <div>
                <input type="submit" value="Save">
            </div>
        </form>
    </body>
</html>
