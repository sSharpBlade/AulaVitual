/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.ArchivosPDF;

import Logica.MYSQL;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Edwin Lopez
 */
public class TareasPDF {
    private int id;
    private String titulo;
    private String descripcion;
    private byte[] archivoAsignado;
    private byte[] archivoTarea;
    private Double nota;
    private int estado;
    private MYSQL cc = new MYSQL();
    private Connection con = cc.conectar();

    public int getIdT() {
        return this.id;
    }

    public void setIdT(String nombre) {
        try {
            String consulta = "SELECT * FROM tareas where tiempo='" + nombre + "'";
            PreparedStatement ps = this.con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public void setIdTarea(String fecha){
        
        
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getArchivoAsignado() {
        return this.archivoAsignado;
    }

    public void setArchivoAsignado(byte[] archivoAsignado) {
        this.archivoAsignado = archivoAsignado;
    }

    public byte[] getArchivoTarea() {
        return this.archivoTarea;
    }

    public void setArchivoTarea(byte[] archivoTarea) {
        this.archivoTarea = archivoTarea;
    }

    public Double getNota() {
        return this.nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TareasPDF{" + "id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", archivoAsignado=" + archivoAsignado + ", archivoTarea=" + archivoTarea + ", nota=" + nota + ", estado=" + estado + '}';
    }
   
    
}
