/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intranet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gianmarco Chistama
 */
public class DBConnection {
    private static DBConnection instance;
    private Connection connection;
    
    private final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=INTRANET_SO;encrypt=false";
    private final String USER = "sa";
    private final String PASSWORD = "database";

    public DBConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch(SQLException exception){
            System.out.println("Error al conectar: " + exception.getMessage());
            exception.printStackTrace();
        }
    }
    
    // Obtener instancia unica de la clase
    public static DBConnection getInstancia() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    // Obtener la conexión activa
    public Connection getConexion() {
        return connection;
    }
    
    public void cerrarConexionDB() throws SQLException{
        try {
            if (connection != null) connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
