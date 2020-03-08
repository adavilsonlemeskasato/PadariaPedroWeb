<%-- 
    Document   : Paes
    Created on : 04/03/2020, 17:51:04
    Author     : davi
--%>

<%@page import="ModeloDeEntidade.Paes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator"%>
<%@page import="Teste.ConnectionFactory"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Paes</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">-->
        <!--<link href="css/style.css" rel="stylesheet" type="text/css" />-->
        <!--        <link rel="stylesheet" href="css/bootstrap.css" type="text/css">
                <script src="js/jquery-3.3.1.slim.min.js"></script>
                <script src="js/popper.min.js"></script>
                <script src="js/bootstrap.min.js"></script>
                <script src="css/bootstrap.min.css"></script>-->
    </head>
    <body>
        <div>
            <jsp:include page="Padaria.jsp"/>
        </div>
        <%
            ArrayList<Paes> paes = (ArrayList<Paes>) request.getAttribute("paes");

//                String CODIGO_PRODUTO = request.getAttribute("CODIGO_PRODUTO").toString();
//         
//
//                    String NOME_PRODUTO = request.getAttribute("NOME_PRODUTO").toString();
//                    String DESC_PRODUTO = request.getAttribute("DESC_PRODUTO").toString();
//                    String VALOR_PRODUTO = request.getAttribute("VALOR_PRODUTO").toString();
//                    String IMG_PRODUTO = request.getAttribute("IMG_PRODUTO").toString();
//                    String COD_CAT_PRODUTO = request.getAttribute("COD_CAT_PRODUTO").toString();
//
//
//
//                System.out.println(CODIGO_PRODUTO);
//                System.out.println(COD_CAT_PRODUTO);
        %>

        <%     for (int i = 0; i < paes.size(); i++) {
        %>
        <div >    
            <div >
                <div >
                    <td >
                        <img style="margin-right: 100px;" src="<%out.print(paes.get(i).getIMG_PRODUTO());%>" height="300"
                             alt="Pão de Queijo " align="left"/>
                        <b> <%out.print(paes.get(i).getNOME_PRODUTO());%>

                        </b><br/><br/>

                        <%out.print(paes.get(i).getDESC_PRODUTO());%> <br/>
                        Valor: <b> R$<%out.print(paes.get(i).getVALOR_PRODUTO());%></b><br/><br/>
                        <input type="hidden" name="id" value="2"/>

                        Quantidade:
                        <select name="qtd">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                            <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                        </select>
                        <p align="center">
                            <input type="submit" value=" Adicionar ao carrinho" name="botao"/>
                        </p>  
                    </td>
                </div>

            </div>
            <br/></br>
            <br/></br>
            <br/></br>
            <br/></br>
            
            <% }%>
        </div>



    </body>
</html>
