/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Usuarios.Acciones;

import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edwin Lopez
 */
public class Estudiante extends Logica.Usuarios.Estudiantes {

    public void llenarPerfil(int id, JTextField lb1, JTextField lb2, JTextField lb3, JTextField lb4, JTextField lb5, JLabel lb6) {
        super.InfoPersonal(id);
        lb1.setText(String.valueOf(super.getCedula()));
        lb2.setText(super.getNombre());
        lb3.setText(super.getApellido());
        lb4.setText(super.getCorreo());
        lb5.setText(super.getDireccion());
        lb6.setIcon(super.getFotoPerfil());
    }

    public ArrayList matriculas(int id) {
        ArrayList asignaturas = new ArrayList();
        String consulta = "select asignaturas.nombre from asignaturas left join usuario_asignatura on asignaturas.id = usuario_asignatura.id_asignatura and usuario_asignatura.id_usuario = " + id + " where usuario_asignatura.id_usuario is null";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                asignaturas.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return asignaturas;
    }

    public ArrayList matriculado(int id) {
        ArrayList asignaturas = new ArrayList();
        String consulta = "select asignaturas.nombre from asignaturas inner join usuario_asignatura on asignaturas.id = usuario_asignatura.id_asignatura where usuario_asignatura.id_usuario = " + id;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                asignaturas.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return asignaturas;
    }

    public void matricularse(int idU, int idA) {
        String consulta = "insert into usuario_asignatura (id_asignatura, id_usuario) values(?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, idA);
            ps.setInt(2, idU);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void getAsignaturas(JTable tbDatos, int id) {
        String consulta = "SELECT asignaturas.nombre, cursos.nombre FROM asignaturas JOIN asignatura_curso ON asignaturas.id = asignatura_curso.id_asignatura JOIN cursos ON asignatura_curso.id_curso = cursos.id JOIN usuario_asignatura ON asignaturas.id = usuario_asignatura.id_asignatura WHERE usuario_asignatura.id_usuario = " + id;
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cursos");
        model.addColumn("Asignaturas");
        tbDatos.setModel(model);
        String[] datos = new String[2];
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("cursos.nombre");
                datos[1] = rs.getString("asignaturas.nombre");
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e.toString());
        }
    }

    public void modificarUsuario(int id, String dni, String nombre, String apellido, String correo, String direccion) {
        String consulta = "update usuarios set cedula=?,nombres=?,apellidos=?,correo=?,direccion=? where id='" + id + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, correo);
            ps.setString(5, direccion);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void tareasCalificadas(JTable tabla, int idU, int idA) {
        String consulta1 = "SELECT tarea_usuario.id_tarea, tarea_usuario.nota FROM tarea_usuario JOIN tarea_asignatura ON tarea_usuario.id_tarea = tarea_asignatura.id_tarea WHERE tarea_usuario.id_usuario = " + idU + " AND tarea_asignatura.id_asignatura = " + idA;
        Integer tarea = null;
        String nota;
        Statement st;
        Statement st1;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tarea");
        model.addColumn("Descripción");
        model.addColumn("Nota");
        tabla.setModel(model);
        String[] datos = new String[3];
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(consulta1);
            while (rs.next()) {
                tarea = rs.getInt("tarea_usuario.id_tarea");
                nota = rs.getString("tarea_usuario.nota");
                if (nota != null) {
                    st1 = (Statement) con.createStatement();
                    ResultSet rs1 = st1.executeQuery("SELECT tareas.titulo, tareas.descripcion FROM tareas WHERE id = " + tarea);
                    if (rs1.next()) {
                        datos[0] = rs1.getString("tareas.titulo");
                        datos[1] = rs1.getString("tareas.descripcion");
                        datos[2] = rs.getString("tarea_usuario.nota");
                        model.addRow(datos);
                    }
                }
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar la tabla notas: "+e.getMessage());
        }

    }
}
