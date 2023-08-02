/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Usuarios;

import Logica.MYSQL;
import com.mysql.jdbc.Connection;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author yepez
 */
public class Estudiantes extends Logica.CargarPanel {

    protected MYSQL cc = new MYSQL();
    protected Connection con = cc.conectar();
    protected int id;
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String direccion;
    protected ImageIcon fotoPerfil;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public ImageIcon getFotoPerfil() {
        return this.fotoPerfil;
    }

    public void setFotoPerfil(ImageIcon fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public void InfoPersonal(int idU) {
        try {
            String consulta = "SELECT * FROM usuarios where id='"+idU+"'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.setCedula(rs.getString("cedula"));
                this.setNombre(rs.getString("nombres"));
                this.setApellido(rs.getString("apellidos"));
                this.setDireccion(rs.getString("direccion"));
                this.setCorreo(rs.getString("correo"));

                Blob blob = rs.getBlob("imagen");
                if (blob != null) {
                    byte[] data = blob.getBytes(1, (int) blob.length());
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(data));
                    } catch (IOException e) {
                        System.out.println("Error en la imagen: "+e.getMessage());
                    }
                    ImageIcon icono = new ImageIcon(img);

                    this.setFotoPerfil(icono);
                }else{
                    this.setFotoPerfil(null);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
