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
        <c:forEach items="${listaPessoas}" var="pessoa">
            <c:out value="${pessoa.nome}"/>
        </c:forEach>
    </body>
</html>
