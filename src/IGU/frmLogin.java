/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import Logica.App;
import Logica.Login;
import Logica.MYSQL;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author yepez
 */
public class frmLogin extends javax.swing.JFrame {

    //Instancia de conexion
    MYSQL cc = new MYSQL();
    Connection con = cc.conectar();

    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lbOculto.setVisible(false);
    }
    
    //Barra de accion
    int xMouse, yMouse;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        pCabeza = new javax.swing.JPanel();
        pSalir = new javax.swing.JPanel();
        lbSalir = new javax.swing.JLabel();
        pMe = new javax.swing.JPanel();
        pRedesSociales = new javax.swing.JPanel();
        lbFacebook = new javax.swing.JLabel();
        lbInsta = new javax.swing.JLabel();
        lbTw = new javax.swing.JLabel();
        lbYt = new javax.swing.JLabel();
        lbPag = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lbOculto = new javax.swing.JLabel();
        lbVisible = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        pInvitadp = new javax.swing.JPanel();
        pIngresar = new javax.swing.JPanel();
        lbBoton = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("frmLogin"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pCabeza.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        pCabeza.setOpaque(false);
        pCabeza.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pCabezaMouseDragged(evt);
            }
        });
        pCabeza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCabezaMousePressed(evt);
            }
        });

        pSalir.setBackground(new java.awt.Color(48, 52, 76));

        lbSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSalir.setForeground(new java.awt.Color(255, 255, 255));
        lbSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSalir.setText("X");
        lbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pSalirLayout = new javax.swing.GroupLayout(pSalir);
        pSalir.setLayout(pSalirLayout);
        pSalirLayout.setHorizontalGroup(
            pSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
            .addGroup(pSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
        );
        pSalirLayout.setVerticalGroup(
            pSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(pSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCabezaLayout = new javax.swing.GroupLayout(pCabeza);
        pCabeza.setLayout(pCabezaLayout);
        pCabezaLayout.setHorizontalGroup(
            pCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCabezaLayout.createSequentialGroup()
                .addGap(0, 993, Short.MAX_VALUE)
                .addComponent(pSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pCabezaLayout.setVerticalGroup(
            pCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCabezaLayout.createSequentialGroup()
                .addComponent(pSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        bg.add(pCabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 30));

        pMe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pMe.setOpaque(false);
        pMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pMeLayout = new javax.swing.GroupLayout(pMe);
        pMe.setLayout(pMeLayout);
        pMeLayout.setHorizontalGroup(
            pMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        pMeLayout.setVerticalGroup(
            pMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        bg.add(pMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 140, 70, 80));

        pRedesSociales.setOpaque(false);
        pRedesSociales.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 3));

        lbFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/facebook.png"))); // NOI18N
        lbFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFacebookMouseClicked(evt);
            }
        });
        pRedesSociales.add(lbFacebook);

        lbInsta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/instagram.png"))); // NOI18N
        lbInsta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbInsta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInstaMouseClicked(evt);
            }
        });
        pRedesSociales.add(lbInsta);

        lbTw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/Twitter.png"))); // NOI18N
        lbTw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbTw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTwMouseClicked(evt);
            }
        });
        pRedesSociales.add(lbTw);

        lbYt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/Youtube.png"))); // NOI18N
        lbYt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbYt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbYtMouseClicked(evt);
            }
        });
        pRedesSociales.add(lbYt);

        lbPag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/web.png"))); // NOI18N
        lbPag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPag.setMaximumSize(new java.awt.Dimension(32, 32));
        lbPag.setMinimumSize(new java.awt.Dimension(32, 32));
        lbPag.setPreferredSize(new java.awt.Dimension(32, 32));
        lbPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPagMouseClicked(evt);
            }
        });
        pRedesSociales.add(lbPag);

        bg.add(pRedesSociales, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 510, 40));

        txtCorreo.setBackground(new java.awt.Color(44, 46, 62));
        txtCorreo.setForeground(new java.awt.Color(72, 76, 105));
        txtCorreo.setText("Ingrese su correo");
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        bg.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 170, 20));

        lbOculto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/invisible.png"))); // NOI18N
        lbOculto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOcultoMouseClicked(evt);
            }
        });
        bg.add(lbOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        lbVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/ojo.png"))); // NOI18N
        lbVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVisibleMouseClicked(evt);
            }
        });
        bg.add(lbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        txtPassword.setBackground(new java.awt.Color(44, 46, 62));
        txtPassword.setForeground(new java.awt.Color(72, 76, 105));
        txtPassword.setText("******");
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        bg.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 366, 150, 20));

        pInvitadp.setBackground(new java.awt.Color(44, 46, 62));
        pInvitadp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pInvitadp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pInvitadp.setOpaque(false);
        pInvitadp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pInvitadpMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pInvitadpLayout = new javax.swing.GroupLayout(pInvitadp);
        pInvitadp.setLayout(pInvitadpLayout);
        pInvitadpLayout.setHorizontalGroup(
            pInvitadpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        pInvitadpLayout.setVerticalGroup(
            pInvitadpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        bg.add(pInvitadp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 90, 10));

        pIngresar.setBackground(new java.awt.Color(246, 246, 246));

        lbBoton.setBackground(new java.awt.Color(246, 246, 246));
        lbBoton.setFont(new java.awt.Font("KG Red Hands", 0, 12)); // NOI18N
        lbBoton.setForeground(new java.awt.Color(44, 46, 62));
        lbBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBoton.setText("INGRESAR");
        lbBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbBotonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pIngresarLayout = new javax.swing.GroupLayout(pIngresar);
        pIngresar.setLayout(pIngresarLayout);
        pIngresarLayout.setHorizontalGroup(
            pIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        pIngresarLayout.setVerticalGroup(
            pIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(pIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 70, 20));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/Fondo.png"))); // NOI18N
        bg.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void pCabezaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCabezaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pCabezaMousePressed

    private void pCabezaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCabezaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pCabezaMouseDragged

    private void lbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMouseClicked
        new MYSQL().desconectar();
        new App();
        App.deleteTempFile();
        System.exit(0);
    }//GEN-LAST:event_lbSalirMouseClicked

    private void lbSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMouseEntered
        pSalir.setBackground(Color.red);

    }//GEN-LAST:event_lbSalirMouseEntered

    private void lbSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMouseExited
        pSalir.setBackground(new Color(48, 52, 76));
    }//GEN-LAST:event_lbSalirMouseExited

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed

    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        if (String.valueOf(txtPassword.getPassword()).equals("******")) {
            txtPassword.setText("");
            txtPassword.setForeground(new Color(246, 246, 246));
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su correo");
            txtCorreo.setForeground(new Color(72, 76, 105));
        }
    }//GEN-LAST:event_txtPasswordMousePressed

    private void lbBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBotonMousePressed
        Login ing = new Login();
        ing.setCorreo(txtCorreo.getText());
        ing.setPass(String.valueOf(txtPassword.getPassword()));
        if (ing.validarIngreso()) {
            this.dispose();
        }
    }//GEN-LAST:event_lbBotonMousePressed

    private void pInvitadpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pInvitadpMousePressed
        frmInvitado formI = new frmInvitado();
        formI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pInvitadpMousePressed

    private void lbVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVisibleMouseClicked
        lbVisible.setVisible(false);
        lbOculto.setVisible(true);
        txtPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_lbVisibleMouseClicked

    private void lbOcultoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOcultoMouseClicked
        lbOculto.setVisible(false);
        lbVisible.setVisible(true);
        txtPassword.setEchoChar('•');
    }//GEN-LAST:event_lbOcultoMouseClicked

    private void lbFacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFacebookMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://es-la.facebook.com/UniversidadTecnicadeAmbatoOficial/"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lbFacebookMouseClicked

    private void lbInstaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInstaMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/utecnicaambato/"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lbInstaMouseClicked

    private void lbTwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTwMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://twitter.com/UTecnicaAmbato"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lbTwMouseClicked

    private void lbYtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbYtMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/@universidadtecnicadeambato9122"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lbYtMouseClicked

    private void lbPagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPagMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.uta.edu.ec/v4.0/index.php/servicios-web"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lbPagMouseClicked

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if (txtCorreo.getText().equals("Ingrese su correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(new Color(246, 246, 246));
        }
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su correo");
            txtCorreo.setForeground(new Color(72, 76, 105));
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getPassword().equals("******")) {
            txtPassword.setText("");
            txtPassword.setForeground(new Color(246, 246, 246));
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
            txtPassword.setText("******");
            txtPassword.setForeground(new Color(72, 76, 105));
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void pMeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMeMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://beacons.ai/sharpblade"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pMeMouseClicked


    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel lbBoton;
    private javax.swing.JLabel lbFacebook;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbInsta;
    private javax.swing.JLabel lbOculto;
    private javax.swing.JLabel lbPag;
    private javax.swing.JLabel lbSalir;
    private javax.swing.JLabel lbTw;
    private javax.swing.JLabel lbVisible;
    private javax.swing.JLabel lbYt;
    private javax.swing.JPanel pCabeza;
    private javax.swing.JPanel pIngresar;
    private javax.swing.JPanel pInvitadp;
    private javax.swing.JPanel pMe;
    private javax.swing.JPanel pRedesSociales;
    private javax.swing.JPanel pSalir;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
