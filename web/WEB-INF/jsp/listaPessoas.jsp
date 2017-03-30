<%-- 
    Document   : listaPessoas
    Created on : 23/03/2017, 09:29:47
    Author     : DesenvolvedorJava
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <thead>
                <th>Id</th>
                <th>Nome</th>
                <th>Email</th>
            </thead>
            
            <tbody>
                <c:forEach items="${listaPessoas}" var="pessoa">
                    <td>${pessoa.id}</td>
                    <td>${pessoa.nome}</td>
                    <td>${pessoa.email}</td>
                <td><a href="excluirPessoa.htm?idPessoa=${pessoa.id}">Excluir</a></td>
                </c:forEach>
            </tbody>
        </table>        
    </body>
</html>
