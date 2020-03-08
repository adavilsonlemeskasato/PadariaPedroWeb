package Teste;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException {

        String driver = "org.apache.derby.jdbc.ClientDriver";
        System.out.println("Conectando ao banco");
        
        try {
            System.out.println("Banco conectado");
            Class.forName(driver);
            return DriverManager.getConnection("jdbc:derby://localhost:1527/padaria", "root", "3636");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
