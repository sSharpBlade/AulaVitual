/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import IGU.frmLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin Lopez
 */
public class Principal {
    public static void main(String[] args) {
        if (new MYSQL().getConector() == 0) {
            new App();
            if (!App.isAppRunning()) {
                App.createTempFile();
                frmLogin Login = new frmLogin();
                Login.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "La base de datos no esta iniciada");
        }
    }

}
