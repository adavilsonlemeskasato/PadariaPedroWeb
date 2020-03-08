/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import ModeloDeEntidade.Paes;
import Teste.ConnectionFactory;
import java.awt.Window;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author davi
 */
@WebServlet(name = "ServletCadastrarItens", urlPatterns = {"/ServletCadastrarItens"})
public class ServletCadastrarItens extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {
            //Crie a Conecção com o Banco de dado
            Connection connection = null;

            try {
                //Inicie a Conecção com o Banco de dado
                connection = new ConnectionFactory().getConnection();
                //Recupere as informações da requisição GET
                String pao = request.getParameter("cod_cat");
                Statement statement = connection.createStatement();
                //Faça a consulta no Banco de Dado
                String query = "Select * from produtos where COD_CAT_PRODUTO = " + pao;
                ResultSet resultados = statement.executeQuery(query);
                //Crie o ArrayList para gaurdar as infomaçoes
                ArrayList<Paes> paes = new ArrayList<>();
                int CODIGO_PRODUTO = 0;
                String NOME_PRODUTO = null;
                String DESC_PRODUTO = null;
                String VALOR_PRODUTO = null;
                String IMG_PRODUTO = null;
                int COD_CAT_PRODUTO = 0;

                while (resultados.next()) {
//                    out.println(query);
//                    out.println("<body>");
//                    out.println("<div>");
//                    out.println("<div>");
//                    out.println(resultados.getString("CODIGO_PRODUTO"));
//                    out.println(resultados.getString("NOME_PRODUTO"));
//                    out.println(resultados.getString("DESC_PRODUTO"));
//                    out.println(resultados.getString("VALOR_PRODUTO"));
//                    out.println(resultados.getString("IMG_PRODUTO"));
//                    out.println(resultados.getString("COD_CAT_PRODUTO"));
//                    out.println("'</div>'");
//                    out.println("'</body>'");
//                    out.println("'</html>'");
//                    int CODIGO_PRODUTO = request.getIntHeader("CODIGO_PRODUTO");
                    
                    CODIGO_PRODUTO = Integer.parseInt(resultados.getString("CODIGO_PRODUTO"));

                    if (CODIGO_PRODUTO == Integer.parseInt(resultados.getString("CODIGO_PRODUTO"))) {
                        NOME_PRODUTO = resultados.getString("NOME_PRODUTO");
                        DESC_PRODUTO = resultados.getString("DESC_PRODUTO");
                        VALOR_PRODUTO = resultados.getString("VALOR_PRODUTO");
                        IMG_PRODUTO = resultados.getString("IMG_PRODUTO");
                        COD_CAT_PRODUTO = Integer.parseInt(resultados.getString("COD_CAT_PRODUTO"));

//                    request.setAttribute("CODIGO_PRODUTO", resultados.getString("CODIGO_PRODUTO"));
//
//                    request.setAttribute("NOME_PRODUTO", resultados.getString("NOME_PRODUTO"));
//                    request.setAttribute("DESC_PRODUTO", resultados.getString("DESC_PRODUTO"));
//                    request.setAttribute("VALOR_PRODUTO", resultados.getString("VALOR_PRODUTO"));
//                    request.setAttribute("IMG_PRODUTO", resultados.getString("IMG_PRODUTO"));
//                    request.setAttribute("COD_CAT_PRODUTO", resultados.getString("COD_CAT_PRODUTO"));
                        System.out.println(paes);
                        //Adicione a lista as informções que vieram do banco de dados 
                        paes.add(new Paes(CODIGO_PRODUTO, NOME_PRODUTO, DESC_PRODUTO, VALOR_PRODUTO, IMG_PRODUTO, COD_CAT_PRODUTO));
                        System.out.println(paes);

                        request.setAttribute("paes", paes);
                    }

                }
                //Direione para a pagina. 
                RequestDispatcher rd = request.getRequestDispatcher("Paes.jsp");
                rd.forward(request, response);
                connection.close();

            } catch (ClassNotFoundException cnfe) {

                out.println("Error loading driver" + cnfe);
            } catch (SQLException sqle) {

                out.println("Error with connection" + sqle);

            } finally {

            }
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
