/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Usuarios.Acciones;

import Logica.MYSQL;
import com.mysql.jdbc.Connection;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Edwin Lopez
 */
public class Camara {

    private FileInputStream imagen;
    private MYSQL cc = new MYSQL();
    private Connection con = cc.conectar();

    public void consulta(int id) {
        String lugar = "update usuarios set imagen=? where id='" + id + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(lugar);
            ps.setBinaryStream(1, this.getImagen());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }

    public FileInputStream getImagen() {
        return imagen;
    }

    public void setImagen(FileInputStream imagen) {
        this.imagen = imagen;
    }

    
}
