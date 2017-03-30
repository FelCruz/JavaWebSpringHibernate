<%-- 
    Document   : cadastroLivro
    Created on : 28/03/2017, 08:56:03
    Author     : DesenvolvedorJava
--%>

<%@taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h2>Cadastro Livro</h2>
        <hr>       
        <s:form action="cadastrarLivro.htm" method="POST" modelAttribute="livro">            
            <table>
                <tr>
                    <td>Titulo: </td>
                    <td><s:input path="title"/></td>
                </tr>
                
                <tr>
                    <td>Autor </td>
                    <td><s:select path="autor.idAutor" items="${listaAutor}" itemValue="idAutor" itemLabel="nome"/></td>
                </tr>
                <tr>
                    <td>Editora: </td>
                    <td><s:select path="editora.idEditora" items="${listaEditora}" itemValue="idEditora" itemLabel="nome"/></td>
                </tr>
                <tr>
                    <td>Ano: </td>
                    <td><s:input path="ano"/></td>
                </tr>
                
            </table>
                <input type="submit" value="Enviar"/>
                <input type="reset" value="Limpar"/>            
        </s:form>
    </body>
</html>
