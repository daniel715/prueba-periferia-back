package com.daniel.prueba.DatabaseConexion;

import java.sql.*;

public class H2Conexion {

    static final String DB_URL = "jdbc:h2:~/maeldung";
    static final String USER = "sa";
    static final String PASS = "";

    private static Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Connection instance = conn;

    private H2Conexion(){}

    //constructor privado para que no se inicialize
    public static Connection getH2Instance(){
        return instance;
    }
}
