/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Usuarios.Acciones;

import Logica.MYSQL;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edwin Lopez
 */
public class Docente {

    private MYSQL cc = new MYSQL();
    private Connection con = cc.conectar();

    public void listaEstudiantes(JTable tbDatos, int idc, int ida) {
        String consulta = "SELECT usuarios.* FROM usuarios JOIN usuario_asignatura ON usuarios.id = usuario_asignatura.id_usuario JOIN asignatura_curso ON usuario_asignatura.id_asignatura = asignatura_curso.id_asignatura JOIN usuario_tipo ON usuarios.id = usuario_tipo.id_usuario WHERE asignatura_curso.id_asignatura = " + ida + " AND asignatura_curso.id_curso = " + idc + " AND usuario_tipo.id_tipo != 2";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cedula");
        model.addColumn("Nombres");
        model.addColumn("Apellidos");
        model.addColumn("Correo");
        model.addColumn("Direccion");
        tbDatos.setModel(model);

        String[] datos = new String[5];
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("nombres");
                datos[2] = rs.getString("apellidos");
                datos[3] = rs.getString("correo");
                datos[4] = rs.getString("direccion");
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e.toString());
        }
    }

    public Integer getIdTablas(String tabla, String nombre) {
        Integer id = null;
        try {
            String consulta = "SELECT id FROM " + tabla + " where nombre ='" + nombre + "'";
            PreparedStatement ps = this.con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return id;
    }

    public ArrayList getAsignaturas(int idU) {
        ArrayList curso = new ArrayList();
        String consulta = "SELECT asignaturas.nombre FROM asignaturas INNER JOIN usuario_asignatura ON asignaturas.id = usuario_asignatura.id_asignatura WHERE usuario_asignatura.id_usuario = " + idU;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                curso.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return curso;
    }

    public ArrayList getCursos(int idU, int idA) {
        ArrayList curso = new ArrayList();
        String consulta = "SELECT cursos.nombre FROM cursos INNER JOIN asignatura_curso ON cursos.id = asignatura_curso.id_curso INNER JOIN usuario_asignatura ON asignatura_curso.id_asignatura = usuario_asignatura.id_asignatura WHERE usuario_asignatura.id_usuario = " + idU + "  AND asignatura_curso.id_asignatura = " + idA;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                curso.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return curso;
    }

    public void getCursosAsignaturas(JTable tbDatos, int idu) {
        String consulta = "SELECT cursos.nombre, asignaturas.nombre FROM cursos JOIN asignatura_curso ON cursos.id = asignatura_curso.id_curso JOIN asignaturas ON asignaturas.id = asignatura_curso.id_asignatura JOIN usuario_asignatura ON asignaturas.id = usuario_asignatura.id_asignatura WHERE usuario_asignatura.id_usuario = " + idu;
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

    public Integer getValido(int idT, int idA) {
        String consulta1 = "SELECT id FROM tarea_asignatura WHERE id_tarea = " + idT + " AND id_asignatura = " + idA;
        Statement st;
        Integer i = null;
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(consulta1);
            while (rs.next()) {
                i = rs.getInt("id");
            }
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al verificar " + e.getMessage());
        }
        return i;
    }

    public void setTablaIntermedia(int idT, int idA, String tiempo) {
        String consulta = "INSERT INTO tarea_asignatura (id_tarea, id_asignatura, tiempo_asignado) VALUES (" + idT + ", " + idA + ", '"+tiempo+"')";
        try {
            PreparedStatement pst = this.con.prepareStatement(consulta);
            pst.executeUpdate();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al unir tablas " + ex.getMessage());
        }
    }

    public void setTareasForAsignatura(int idT, int idC, int idA) {
        String consulta1 = "SELECT tarea_asignatura.id_tarea, usuario_asignatura.id_usuario FROM tarea_asignatura JOIN asignatura_curso ON tarea_asignatura.id_asignatura = asignatura_curso.id_asignatura JOIN usuario_asignatura ON asignatura_curso.id_asignatura = usuario_asignatura.id_asignatura WHERE asignatura_curso.id_curso = " + idC + " AND asignatura_curso.id_asignatura = " + idA;
        String consulta2 = "INSERT INTO tarea_usuario (id_tarea, id_usuario, tiempo_asignado) VALUES (?,?,?)";
        int tarea = 0;
        int usuario = 0;
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(consulta1);
            PreparedStatement pst = this.con.prepareStatement(consulta2);
            while (rs.next()) {
                tarea = rs.getInt("tarea_asignatura.id_tarea");
                usuario = rs.getInt("usuario_asignatura.id_usuario");
                pst.setInt(1, tarea);
                pst.setInt(2, usuario);
                Date fechaHoraActual = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String fechaHoraFormateada = formato.format(fechaHoraActual);
                pst.setString(3, fechaHoraFormateada);
                pst.executeUpdate();
            }
            pst.close();
            st.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al asignar la tarea " + ex.getMessage());
        }
    }

    public void eliminarTarea(int idT) {
        String consulta = "delete from tareas where id = '" + idT + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void calificarTarea(String tiempo, Double nota) {
        String consulta = "update tarea_usuario set nota=? where tarea_usuario.tiempo_subida='" + tiempo + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.setDouble(1, nota);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
