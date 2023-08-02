
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.ArchivosPDF;

import Logica.MYSQL;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edwin Lopez
 */
public class PDF {

    private MYSQL cc = new MYSQL();
    private Connection con = cc.conectar();
    private TareasPDF pdf = new TareasPDF();

    public void tareasEstudiante(JTable tabla, int idU, int estado) {
        String consulta = "SELECT tareas.*, tarea_usuario.* FROM usuarios INNER JOIN usuario_tipo ON usuario_tipo.id_usuario= usuarios.id INNER JOIN tipos ON tipos.id = usuario_tipo.id_tipo INNER JOIN tarea_usuario ON tarea_usuario.id_usuario = usuarios.id INNER JOIN tareas ON tareas.id = tarea_usuario.id_tarea WHERE usuarios.id = " + idU + " AND tarea_usuario.estado=" + estado+" ";
        PreparedStatement ps;
        ResultSet rs;
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Titulo");
        dt.addColumn("Descripcion");
        dt.addColumn("Asignacion");
        dt.addColumn("Tarea");
        dt.addColumn("Nota");
        dt.addColumn("Tiempo creado");
        dt.addColumn("Tiempo asignado");
        dt.addColumn("Tiempo subida");
        tabla.setModel(dt);

        ImageIcon icono = null;
        if (get_Image("/IGU/IMG/pdf.png") != null) {
            icono = new ImageIcon(get_Image("/IGU/IMG/pdf.png"));
        }

        Object[] datos = new Object[8];
        String time = "";
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                pdf.setIdT(rs.getString("tareas.tiempo"));
                pdf.setTitulo(rs.getString("tareas.titulo"));
                pdf.setDescripcion(rs.getString("tareas.descripcion"));
                pdf.setArchivoAsignado(rs.getBytes("tareas.archivo_asignado"));
                pdf.setArchivoTarea(rs.getBytes("tarea_usuario.archivo_tarea"));
                pdf.setEstado(rs.getInt("tarea_usuario.estado"));
                pdf.setNota(rs.getDouble("tarea_usuario.nota"));
                datos[0] = pdf.getTitulo();
                datos[1] = pdf.getDescripcion();
                if (pdf.getArchivoAsignado() != null) {
                    datos[2] = new JButton(icono);
                } else {
                    datos[2] = new JButton("Vacio");
                }
                if (pdf.getArchivoTarea() != null) {
                    datos[3] = new JButton(icono);
                } else {
                    datos[3] = new JButton("Vacio");
                }
                if (pdf.getNota() != 0.0) {
                    datos[4] = pdf.getNota();
                } else {
                    datos[4] = "Sin calificar";
                }
                datos[5] = rs.getString("tareas.tiempo");
                datos[6] = rs.getString("tarea_usuario.tiempo_asignado");
                time = rs.getString("tarea_usuario.tiempo_subida");
                if (time != null) {
                    datos[7] = rs.getString("tarea_usuario.tiempo_subida");
                } else {
                    datos[7] = "--|--";
                }
                dt.addRow(datos);
            }
            tabla.setRowHeight(32);
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void crearTarea(String titulo, String des, byte[] archivo, int idD, String tiempo) {
        String consulta = "insert into tareas values (?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, 0);
            ps.setString(2, titulo);
            ps.setString(3, des);
            ps.setBytes(4, archivo);
            ps.setInt(5, idD);
            ps.setString(6, tiempo);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void subirTarea(int idTarea, byte[] tarea, int idU, String tiempo, String tiempoA) {
        String consulta = "update tarea_usuario set archivo_tarea=?, estado=?, tiempo_subida=? where tarea_usuario.id_tarea=" + idTarea + " AND tarea_usuario.id_usuario=" + idU + " AND tarea_usuario.tiempo_asignado= '"+tiempoA+"' ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.setBytes(1, tarea);
            ps.setInt(2, 1);
            ps.setString(3, tiempo);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void modificarTarea(String titulo, String descripcion, byte[] archivo, int id, String tiempo){
        String consulta = "update tareas set titulo=?, descripcion=?, archivo_asignado=? where id_creador="+id+" AND tiempo='"+tiempo+"'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, titulo);
            ps.setString(2, descripcion);
            ps.setBytes(3, archivo);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void modificarTareaSimple(String titulo, String descripcion, int id, String tiempo){
        String consulta = "update tareas set titulo=?, descripcion=? where id_creador="+id+" AND tiempo='"+tiempo+"'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, titulo);
            ps.setString(2, descripcion);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void abrirArchivoAsignado(String tiempo) {
        String consulta = "select archivo_asignado from tareas where tiempo='" + tiempo+"'";
        PreparedStatement ps;
        ResultSet rs;
        byte[] b = null;
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);
            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);
            out.close();
            bos.close();
            ps.close();
            rs.close();
        } catch (IOException | NumberFormatException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void abrirArchivoTarea(String tiempo) {
        String consulta = "select archivo_tarea from tarea_usuario where tiempo_subida='" + tiempo+"'";
        PreparedStatement ps;
        ResultSet rs;
        byte[] b = null;
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);
            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);
            out.close();
            bos.close();
            ps.close();
            rs.close();
        } catch (IOException | NumberFormatException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }

    public void tareasPorAsignar(JTable tabla, int idU) {
        String consulta = "SELECT tareas.* FROM tareas WHERE id_creador = " + idU;
        PreparedStatement ps;
        ResultSet rs;
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Titulo");
        dt.addColumn("Descripcion");
        dt.addColumn("Asignacion");
        dt.addColumn("Tiempo");
        tabla.setModel(dt);

        ImageIcon icono = null;
        if (get_Image("/IGU/IMG/pdf.png") != null) {
            icono = new ImageIcon(get_Image("/IGU/IMG/pdf.png"));
        }

        Object[] datos = new Object[4];
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                pdf.setIdT(rs.getString("tareas.tiempo"));
                pdf.setTitulo(rs.getString("tareas.titulo"));
                pdf.setDescripcion(rs.getString("tareas.descripcion"));
                pdf.setArchivoAsignado(rs.getBytes("tareas.archivo_asignado"));
                datos[0] = pdf.getTitulo();
                datos[1] = pdf.getDescripcion();
                if (pdf.getArchivoAsignado() != null) {
                    datos[2] = new JButton(icono);
                } else {
                    datos[2] = new JButton("Vacio");
                }
                datos[3] = rs.getString("tareas.tiempo");
                dt.addRow(datos);
            }
            tabla.setRowHeight(32);
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void tablaTareas(JTable tabla, int idA, int idU, String estado) {
        String consulta = "SELECT tarea_usuario.* FROM tarea_usuario JOIN tarea_asignatura ON tarea_usuario.id_tarea = tarea_asignatura.id_tarea JOIN usuario_asignatura ON tarea_asignatura.id_asignatura = usuario_asignatura.id_asignatura WHERE usuario_asignatura.id_asignatura = '" + idA + "' AND tarea_usuario.id_usuario != '" + idU + "' AND tarea_usuario.estado = 1 AND tarea_usuario.nota IS " + estado + " NULL GROUP BY tarea_usuario.id, tarea_usuario.tiempo_asignado";
        Integer idTarea = null;
        Integer idEstudiante = null;
        PreparedStatement ps;
        ResultSet rs;
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Alumno");
        dt.addColumn("Titulo");
        dt.addColumn("Tarea");
        dt.addColumn("Nota");
        dt.addColumn("Fecha");
        tabla.setModel(dt);

        ImageIcon icono = null;
        if (get_Image("/IGU/IMG/pdf.png") != null) {
            icono = new ImageIcon(get_Image("/IGU/IMG/pdf.png"));
        }

        Object[] datos = new Object[5];
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                idEstudiante = rs.getInt("tarea_usuario.id_usuario");
                idTarea = rs.getInt("tarea_usuario.id_tarea");

                Statement st1 = (Statement) con.createStatement();
                ResultSet rs1 = st1.executeQuery("SELECT usuarios.nombres, usuarios.apellidos FROM usuarios WHERE id =" + idEstudiante);
                if (rs1.next()) {
                    datos[0] = rs1.getString("usuarios.nombres") + " " + rs1.getString("usuarios.apellidos");
                }

                Statement st2 = (Statement) con.createStatement();
                ResultSet rs2 = st2.executeQuery("SELECT tareas.titulo FROM tareas WHERE tareas.id = " + idTarea + " AND tareas.id_creador =" + idU);
                if (rs2.next()) {
                    datos[1] = rs2.getString("tareas.titulo");
                }

                pdf.setArchivoTarea(rs.getBytes("tarea_usuario.archivo_tarea"));
                if (pdf.getArchivoTarea() != null) {
                    datos[2] = new JButton(icono);
                } else {
                    datos[2] = new JButton("Vacio");
                }

                datos[3] = rs.getDouble("tarea_usuario.nota");
                datos[4] = rs.getString("tarea_usuario.tiempo_subida");

                dt.addRow(datos);

            }
            tabla.setRowHeight(32);
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void modificarTarea(){
        String consulta = "UPDATE ";
        
    }
}
