/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Usuarios;

import Logica.MYSQL;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yepez
 */
public class Administradores extends Logica.CargarPanel {

    protected MYSQL cc = new MYSQL();
    protected Connection con = cc.conectar();
    protected int id;
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String direccion;
    protected String pass;

    public boolean verificarDNI() {
        boolean valor = false;
        int contador = 0;
        int numero = 0;
        if (this.getCedula().length() == 10) {
            if (!"0000000000".equals(cedula)) {
                for (int i = 0; i < 10; i++) {
                    numero = Integer.parseInt(String.valueOf(this.getCedula().charAt(i)));
                    if (i % 2 == 0) {
                        numero = numero * 2;
                        if (numero > 9) {
                            numero = numero - 9;
                        }
                    }
                    contador = contador + numero;
                }
                if (contador % 10 == 0) {
                    valor = true;
                } else {
                    contador = contador - 10;
                    if (contador == numero) {
                        valor = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cedula no valida");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Cedula no valida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Longitud de la cedula incorrecta");
        }
        return valor;
    }

    public int getId() {
        return this.id;
    }

    public void setId(String tabla, String nombre) {
        try {
            String consulta = "SELECT * FROM " + tabla + " where nombre='" + nombre + "'";
            PreparedStatement ps = this.con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void setId(String cedula) {
        try {
            String consulta = "SELECT * FROM usuarios where cedula='" + cedula + "'";
            PreparedStatement ps = this.con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
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

    public String getPass() {
        try {
            String consulta = "SELECT * FROM usuarios where id='" + this.getId() + "'";
            PreparedStatement ps = this.con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.setPass(rs.getString("pass"));
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    protected String pas;

    public void setPas(String pas) {
        this.pas = pas;
    }

    public String getPas() {
        return this.pas;
    }

}
