package com.daniel.prueba.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCNewTable {

    static final String DB_URL = "jdbc:h2:~/prueba";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("org.h2.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

            String sql = "CREATE TABLE Request " +
                    "(id VARCHAR(45) not NULL, " +
                    " monto DOUBLE PRECISION(255), " +
                    " monedaOrigen VARCHAR(10), " +
                    " monedaDestino VARCHAR(10), ";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
