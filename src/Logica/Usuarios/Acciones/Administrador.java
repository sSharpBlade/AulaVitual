package Logica.Usuarios.Acciones;

import Logica.MYSQL;
import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edwin Lopez
 */
public class Administrador extends Logica.Usuarios.Administradores {

    private MYSQL cc = new MYSQL();
    private Connection con = cc.conectar();
    private int idT;

    public void crearUsuarios() {
        String consultaA = "insert into usuarios values(?,?,?,?,?,?,?,?)";
        Blob vacio = null;
        try {
            PreparedStatement pst = this.con.prepareStatement(consultaA);
            pst.setInt(1, 0);
            pst.setString(2, this.getCedula());
            pst.setString(3, this.getNombre());
            pst.setString(4, this.getApellido());
            pst.setString(5, this.getCorreo());
            pst.setString(6, this.getDireccion());
            pst.setString(7, this.getPass());
            pst.setBlob(8, vacio);
            pst.executeUpdate();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear usuario, verifique los datos,\nposiblemente cedula duplicada");
        }
    }

    
    public void modificarUsuario() {
        String consulta = "update usuarios set cedula=?,nombres=?,apellidos=?,correo=?,direccion=?,pass=? where id='" + this.getId() + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, this.getCedula());
            ps.setString(2, this.getNombre());
            ps.setString(3, this.getApellido());
            ps.setString(4, this.getCorreo());
            ps.setString(5, this.getDireccion());
            ps.setString(6, this.getPas());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminarUsuario() {
        String consulta = "delete from usuarios where id = '" + this.getId() + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void actualizarTablaUsuarios(JTable tbDatos) {
        String consulta = "SELECT * FROM usuarios WHERE NOT (correo = 'admin' AND pass = 'admin') ORDER BY cedula";
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

    public ArrayList getUsuariosTipo(String rol) {
        ArrayList usuarios = new ArrayList();
        String consulta = "SELECT usuarios.* FROM usuarios LEFT JOIN usuario_tipo ON usuarios.id = usuario_tipo.id_usuario WHERE usuario_tipo.id_tipo " + rol;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuarios.add(rs.getString("cedula") + ", " + rs.getString("nombres") + " " + rs.getString("apellidos"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return usuarios;
    }

    public void setIdT(String cadena) {
        int n = 0;
        String nCedula = cadena.substring(0, 10);
        String consulta = "select id from usuarios where cedula='" + nCedula + "'";
        try {
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                n = rs.getInt("id");
            }
        } catch (SQLException e) {
        }
        this.idT = n;
    }

    public int getIdT() {
        return this.idT;
    }

    public void asignarTipo(int IDtipo) {
        String consulta = "insert into usuario_tipo (id_usuario, id_tipo) values (?,?)";
        try {
            PreparedStatement pst = this.con.prepareStatement(consulta);
            pst.setInt(1, this.getIdT());
            pst.setInt(2, IDtipo);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminarTipo() {
        String consulta = "delete from usuario_tipo where id_usuario = '" + this.getId() + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void actualizarTablaTipo(JTable tbDatos, int tipo) {
        String consulta = "SELECT usuarios.* FROM usuarios LEFT JOIN usuario_tipo ON usuarios.id = usuario_tipo.id_usuario WHERE NOT (correo = 'admin' AND pass = 'admin') AND usuario_tipo.id_tipo = " + tipo+"  ORDER BY cedula";
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

    public void crearCursos(String tabla) {
        String consulta = "insert into " + tabla + " values(?,?)";
        try {
            PreparedStatement pst = this.con.prepareStatement(consulta);
            pst.setInt(1, 0);
            pst.setString(2, this.getNombre());
            pst.executeUpdate();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el curso: " + ex.getMessage());
        }
    }

    public void actualizarTablaCursos(String tabla, JTable tbDatos) {
        String consulta = "SELECT * from " + tabla;
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cursos");
        tbDatos.setModel(model);
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

    public void modificarCurso(String tabla) {
        String consulta = "update " + tabla + " set nombre=? where id='" + this.getId() + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, this.getNombre());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminarCA(String tabla) {
        String consulta = "delete from " + tabla + " where id = '" + this.getId() + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList getAsignaturas() {
        ArrayList asignaturas = new ArrayList();
        String consulta = "SELECT asignaturas.* FROM asignaturas LEFT JOIN usuario_asignatura ON asignaturas.id = usuario_asignatura.id_asignatura WHERE usuario_asignatura.id_usuario IS NULL";
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

    public void asignarDocentes() {
        String consulta = "insert into usuario_asignatura (id_asignatura, id_usuario) values(?,?)";
        try {
            PreparedStatement pst = this.con.prepareStatement(consulta);
            pst.setInt(1, this.getId());
            pst.setInt(2, this.getIdT());
            pst.executeUpdate();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el curso: " + ex.getMessage());
        }
    }
    
    public void desvincularDocentes(int asignatura, int docente){
        String consulta = "delete from usuario_asignatura where id_asignatura = '" + asignatura + "' AND id_usuario = '" + docente + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void getAsignacion(JTable tbDatos) {
        String consulta = "SELECT usuarios.nombres, usuarios.apellidos, usuarios.cedula, asignaturas.nombre FROM usuarios JOIN usuario_tipo ON usuarios.id = usuario_tipo.id_usuario JOIN usuario_asignatura ON usuarios.id = usuario_asignatura.id_usuario JOIN asignaturas ON usuario_asignatura.id_asignatura = asignaturas.id WHERE usuario_tipo.id_tipo = '2' ORDER BY asignaturas.nombre";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Docentes");
        model.addColumn("Asignaturas");
        tbDatos.setModel(model);
        String[] datos = new String[2];
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("usuarios.cedula") + ", " +rs.getString("usuarios.nombres") + " " + rs.getString("usuarios.apellidos");
                datos[1] = rs.getString("asignaturas.nombre");
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e.toString());
        }
    }

    public void getAsignaturasSCurso(JTable tabla) {
        String consulta = "SELECT nombre FROM asignaturas WHERE id NOT IN (SELECT id_asignatura FROM asignatura_curso)";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Asignaturas");
        tabla.setModel(model);
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

    public void setAsigntauraCurso(int c, int a) {
        String consulta = "insert into asignatura_curso (id_curso, id_asignatura) values(?,?)";
        try {
            PreparedStatement pst = this.con.prepareStatement(consulta);
            pst.setInt(1, c);
            pst.setInt(2, a);
            pst.executeUpdate();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el curso: " + ex.getMessage());
        }
    }

    public void tablaUnida(JTable tabla) {
        String consulta = "SELECT cursos.nombre, asignaturas.nombre FROM cursos JOIN asignatura_curso ON cursos.id = asignatura_curso.id_curso JOIN asignaturas ON asignaturas.id = asignatura_curso.id_asignatura";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cursos");
        model.addColumn("Asignaturas");
        tabla.setModel(model);
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

    public void desvincularAC(int asignatura, int curso) {
        String consulta = "delete from asignatura_curso where id_asignatura = '" + asignatura + "' AND id_curso = '" + curso + "'";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public boolean validarAC(String tabla, String nombre){
        boolean validar = true;
        String consulta = "SELECT nombre FROM "+tabla;
        Statement st;
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                if (nombre == rs.getString("nombre")) {
                    validar = false;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar " + e.toString());
        }
        return validar;
    }
}
