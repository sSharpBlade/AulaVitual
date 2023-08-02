package Logica;

import IGU.frmAdmin;
import IGU.frmEstudiantes;
import IGU.frmDocentes;
import Logica.Modelo.IdUsuario;
import Logica.Modelo.Usuario;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin Lopez
 */
public class Login {

    private String correo;
    private String pass;
    private IdUsuario id = Usuario.idU;
    private MYSQL cc = new MYSQL();
    private Connection con = cc.conectar();

    public boolean validarIngreso() {
        Boolean ing = false;
        Verificador aux = new Verificador();
        if (aux.validate(this.getCorreo())) {
            int r = 0;
            String consulta = "SELECT usuarios.id, usuarios.nombres, usuarios.apellidos, tipos.id FROM usuarios LEFT JOIN usuario_tipo ON usuarios.id = usuario_tipo.id_usuario LEFT JOIN tipos ON usuario_tipo.id_tipo = tipos.id WHERE usuarios.correo = '" + this.getCorreo() + "' AND usuarios.pass = '" + this.getPass() + "' ";
            try {
                PreparedStatement st = this.con.prepareStatement(consulta);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    r = 1;
                    if (r == 1) {
                        Integer tipo = rs.getInt("tipos.id");
                        if (tipo == null) {
                            tipo = 0;
                        }
                        this.id.setId(rs.getInt("usuarios.id"));
                        switch (tipo) {
                            case 1:
                                frmAdmin formA = new frmAdmin();
                                formA.setVisible(true);
                                ing = true;
                                break;
                            case 2:
                                frmDocentes formD = new frmDocentes();
                                formD.setVisible(true);
                                ing = true;
                                break;
                            case 3:
                                frmEstudiantes formE = new frmEstudiantes();
                                formE.setVisible(true);
                                ing = true;
                                break;
                            case 0:
                                JOptionPane.showMessageDialog(null, "Bienvenido \nlamentablemente el usuario que intento ingresar no cuenta con un rol determinado, \npor favor consulte con un administrador");
                        }
                    }
                } else {
                    String mensaje = "Error de acceso, verifique su información";
                    JOptionPane.showMessageDialog(null, mensaje);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta ingresando un correo no valido");
        }
        return ing;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
