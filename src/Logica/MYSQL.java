/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yepez
 */
public class MYSQL extends BaseDatos{
    private Connection con = null;
    private int conector = 0;
    
    public MYSQL(){
        super.setNombre("proyecto_final");
        super.setUrl("jdbc:mysql://localhost:3306/proyecto_final");
        super.setUsuario("root");
        super.setClave("");
        super.setDriver("com.mysql.jdbc.Driver");
    }
    
    public Connection conectar() {
        try {
            Class.forName(this.getDriver());
            con = (Connection) DriverManager.getConnection(this.getUrl(), this.getUsuario(), this.getClave());
        } catch (ClassNotFoundException | SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error de conexion " + ex.getMessage());
            this.setConector(1);
        }
        return con;
    }
    
    public void desconectar(){
        try {
            this.conectar().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getConector() {
        this.conectar();
        return this.conector;
    }

    public void setConector(int conector) {
        this.conector = conector;
    }

}
