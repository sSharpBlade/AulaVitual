/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Usuarios.Acciones;

import Logica.MYSQL;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edwin Lopez
 */
public class Invitado extends Logica.CargarPanel{
    private JTable tabla = new JTable();
    private MYSQL cc = new MYSQL();
    private Connection con = cc.conectar();

    public JTable getTabla() {
        return this.tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }
    
    public void mostrarCursos(){
        String consulta= "select * from cursos";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cursos");
        this.getTabla().setModel(model);

        String[] datos = new String[1];
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("nombre");
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e.toString());
        }
    }
    
    public void mostrarAsignaturas(){
        String consulta = "select * from asignaturas";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Asignaturas");
        this.getTabla().setModel(model);

        String[] datos = new String[1];
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("nombre");
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e.toString());
        }
    }
}
