package DB_Connection;

import java.sql.*;

public class DB_Connector {

    // PostgreSQL JDBC Driver
    private static String url = "jdbc:postgresql://localhost:5432/VendingMachine";
    // user name
    private static String user = "postgres";
    // pass word
    private static String pass = "030493";
    private static Connection conn = null;

    public static Connection connect(){
        System.out.println("\n--Connecting to postgreSQL JDBC--");
        // Locate PostgreSQL JDBC Driver
        try {
            conn = DriverManager.getConnection(url, user, pass);
        }
        // Catch exceptions if JDBC is not found
        catch (Exception ex){
            ex.printStackTrace();
        }

        // if connection successful
        if (conn != null) {
            System.out.println("\n--It worked! Connection successful--");
        } else {
            System.out.println("\n--Connection failed--");
        }
        return conn;

    }
}