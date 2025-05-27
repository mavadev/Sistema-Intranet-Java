/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intranet.controllers;


import com.intranet.db.DBConnection;
import com.intranet.models.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gianmarco Chistama
 */
public class UsuarioController {

    private final Connection conn;

    public UsuarioController() {
        this.conn = DBConnection.getInstancia().getConexion(); 
    }
    
    public Usuario login(String correo, String contraseña) {
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND contraseña = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, correo);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Usuario(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("correo"),
                    rs.getString("contraseña"),
                    rs.getString("rol"),
                    rs.getTimestamp("creado_en").toLocalDateTime()
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer login: " + e.getMessage());
        }
        return null;
    }

    public boolean registrar(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, apellido, correo, contraseña, rol) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getApellido());
            stmt.setString(3, usuario.getCorreo());
            stmt.setString(4, usuario.getContraseña());
            stmt.setString(5, usuario.getRol());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
            return false;
        }
    }
}
