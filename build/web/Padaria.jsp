<%-- 
    Document   : Padaria.jsp
    Created on : 28/02/2020, 22:18:04
    Author     : davi
--%>

<%@page import="Teste.ConnectionFactory"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css">
        <script src="js/jquery-3.3.1.slim.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="css/bootstrap.min.css"></script>

        <title>Padaria</title>
    </head>
    <body>
        <div  align="center">
            <form action="/ServletCadastrarItens"  method="Get">
                <div id="centralizado">
                    <a href="menu.jsp">Inicio</a>

                    <%
                        Connection connection = null;
                        try {

                            connection = new ConnectionFactory().getConnection();

                            Statement statement = connection.createStatement();
                            String query = "Select * from Categoria_produto";
                            ResultSet resultados = statement.executeQuery(query);

                            while (resultados.next()) {
                                out.println("<a href=\"ServletCadastrarItens?cod_cat=");
                                out.println(resultados.getString("codigo_categoria") + "\">");
                                out.println(resultados.getString("nome_categoria") + "</a>");

                            }
                            connection.close();
                        } catch (ClassNotFoundException cnfe) {
                            out.print("Error loading driver" + cnfe);
                        } catch (SQLException sqle) {
                            out.print("Error with connection" + sqle);
                        }

                    %>

                    <a href="carrinho.jsp">Meu Carrinho</a><br/>
                </div>
            </form>
        </div>
    </body>
</html>
