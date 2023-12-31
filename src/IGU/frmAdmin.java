/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import Logica.MYSQL;
import java.awt.Color;
import Logica.Usuarios.Acciones.Administrador;
import IGU.Administrador.*;
import Logica.App;
/**
 *
 * @author yepez
 */
public class frmAdmin extends javax.swing.JFrame {
    
    /**
     * Creates new form frmAdmin
     */
    public frmAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private int xMouse, yMouse;
    private Administrador admin = new Administrador();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCabeza = new javax.swing.JPanel();
        pSalir = new javax.swing.JPanel();
        lbSalir = new javax.swing.JLabel();
        pSesion = new javax.swing.JPanel();
        lbCerrarSesion = new javax.swing.JLabel();
        pAdmin = new javax.swing.JPanel();
        pBotones = new javax.swing.JPanel();
        pDocente = new javax.swing.JPanel();
        txtDo = new javax.swing.JLabel();
        pEstudiantes = new javax.swing.JPanel();
        txtEs = new javax.swing.JLabel();
        pAsignaturas = new javax.swing.JPanel();
        txtAs = new javax.swing.JLabel();
        pUsuarios = new javax.swing.JPanel();
        txtUs = new javax.swing.JLabel();
        pCursos = new javax.swing.JPanel();
        txtCu = new javax.swing.JLabel();
        pAsignar = new javax.swing.JPanel();
        txtAsi = new javax.swing.JLabel();
        pAccion = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pSalir.setBackground(new java.awt.Color(238, 238, 238));
        pSalir.setPreferredSize(new java.awt.Dimension(30, 25));

        lbSalir.setBackground(new java.awt.Color(238, 238, 238));
        lbSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSalir.setForeground(new java.awt.Color(0, 0, 0));
        lbSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSalir.setText("X");
        lbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSalir.setPreferredSize(new java.awt.Dimension(30, 25));
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
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(pSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pSalirLayout.setVerticalGroup(
            pSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pSesion.setBackground(new java.awt.Color(204, 204, 204));

        lbCerrarSesion.setBackground(new java.awt.Color(238, 238, 238));
        lbCerrarSesion.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lbCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        lbCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCerrarSesion.setText("Cerrar Sesión");
        lbCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCerrarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pSesionLayout = new javax.swing.GroupLayout(pSesion);
        pSesion.setLayout(pSesionLayout);
        pSesionLayout.setHorizontalGroup(
            pSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pSesionLayout.setVerticalGroup(
            pSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pCabezaLayout = new javax.swing.GroupLayout(pCabeza);
        pCabeza.setLayout(pCabezaLayout);
        pCabezaLayout.setHorizontalGroup(
            pCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCabezaLayout.createSequentialGroup()
                .addContainerGap(888, Short.MAX_VALUE)
                .addComponent(pSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pCabezaLayout.setVerticalGroup(
            pCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCabezaLayout.createSequentialGroup()
                .addGroup(pCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pCabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 25));

        pAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pAdmin.setOpaque(false);
        pAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pAdminLayout = new javax.swing.GroupLayout(pAdmin);
        pAdmin.setLayout(pAdminLayout);
        pAdminLayout.setHorizontalGroup(
            pAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        pAdminLayout.setVerticalGroup(
            pAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        getContentPane().add(pAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 27, -1, -1));

        pBotones.setOpaque(false);
        pBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 20));

        pDocente.setBackground(new java.awt.Color(215, 35, 35));
        pDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pDocente.setPreferredSize(new java.awt.Dimension(240, 40));
        pDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDocenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pDocenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pDocenteMouseExited(evt);
            }
        });
        pDocente.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtDo.setBackground(new java.awt.Color(246, 246, 246));
        txtDo.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtDo.setForeground(new java.awt.Color(255, 255, 255));
        txtDo.setText("DOCENTES");
        pDocente.add(txtDo);

        pBotones.add(pDocente);

        pEstudiantes.setBackground(new java.awt.Color(215, 35, 35));
        pEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pEstudiantes.setPreferredSize(new java.awt.Dimension(240, 40));
        pEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pEstudiantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pEstudiantesMouseExited(evt);
            }
        });
        pEstudiantes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtEs.setBackground(new java.awt.Color(246, 246, 246));
        txtEs.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtEs.setForeground(new java.awt.Color(255, 255, 255));
        txtEs.setText("ESTUDIANTES");
        pEstudiantes.add(txtEs);

        pBotones.add(pEstudiantes);

        pAsignaturas.setBackground(new java.awt.Color(215, 35, 35));
        pAsignaturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pAsignaturas.setPreferredSize(new java.awt.Dimension(240, 40));
        pAsignaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pAsignaturasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pAsignaturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pAsignaturasMouseExited(evt);
            }
        });
        pAsignaturas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtAs.setBackground(new java.awt.Color(246, 246, 246));
        txtAs.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtAs.setForeground(new java.awt.Color(255, 255, 255));
        txtAs.setText("ASIGNATURAS");
        pAsignaturas.add(txtAs);

        pBotones.add(pAsignaturas);

        pUsuarios.setBackground(new java.awt.Color(215, 35, 35));
        pUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pUsuarios.setPreferredSize(new java.awt.Dimension(240, 40));
        pUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pUsuariosMouseExited(evt);
            }
        });
        pUsuarios.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtUs.setBackground(new java.awt.Color(246, 246, 246));
        txtUs.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtUs.setForeground(new java.awt.Color(255, 255, 255));
        txtUs.setText("USUARIOS");
        pUsuarios.add(txtUs);

        pBotones.add(pUsuarios);

        pCursos.setBackground(new java.awt.Color(215, 35, 35));
        pCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pCursos.setPreferredSize(new java.awt.Dimension(240, 40));
        pCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCursosMouseExited(evt);
            }
        });
        pCursos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtCu.setBackground(new java.awt.Color(246, 246, 246));
        txtCu.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtCu.setForeground(new java.awt.Color(255, 255, 255));
        txtCu.setText("CURSOS");
        pCursos.add(txtCu);

        pBotones.add(pCursos);

        pAsignar.setBackground(new java.awt.Color(215, 35, 35));
        pAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pAsignar.setPreferredSize(new java.awt.Dimension(240, 40));
        pAsignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pAsignarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pAsignarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pAsignarMouseExited(evt);
            }
        });
        pAsignar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtAsi.setBackground(new java.awt.Color(246, 246, 246));
        txtAsi.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtAsi.setForeground(new java.awt.Color(255, 255, 255));
        txtAsi.setText("ASIGNAR DOCENTES");
        pAsignar.add(txtAsi);

        pBotones.add(pAsignar);

        getContentPane().add(pBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 252, 435));

        pAccion.setOpaque(false);

        javax.swing.GroupLayout pAccionLayout = new javax.swing.GroupLayout(pAccion);
        pAccion.setLayout(pAccionLayout);
        pAccionLayout.setHorizontalGroup(
            pAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );
        pAccionLayout.setVerticalGroup(
            pAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        getContentPane().add(pAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 30, 772, 546));

        bg.setPreferredSize(new java.awt.Dimension(1024, 576));

        bgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/Invitado.png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bgImg, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bgImg, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pCabezaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCabezaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pCabezaMouseDragged

    private void pCabezaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCabezaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pCabezaMousePressed

    private void pDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDocenteMouseClicked
        admin.showPanel(new pCRUD_EstudiantesDocentesAdmins(2), pAccion);
    }//GEN-LAST:event_pDocenteMouseClicked

    private void pDocenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDocenteMouseEntered
        pDocente.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pDocenteMouseEntered

    private void pDocenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDocenteMouseExited
        pDocente.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pDocenteMouseExited

    private void pEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEstudiantesMouseClicked
        admin.showPanel(new pCRUD_EstudiantesDocentesAdmins(3), pAccion);
    }//GEN-LAST:event_pEstudiantesMouseClicked

    private void pEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEstudiantesMouseEntered
        pEstudiantes.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pEstudiantesMouseEntered

    private void pEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEstudiantesMouseExited
        pEstudiantes.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pEstudiantesMouseExited

    private void pAsignaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAsignaturasMouseClicked
        admin.showPanel(new pCRUD_Asignaturas(), pAccion);
    }//GEN-LAST:event_pAsignaturasMouseClicked

    private void pAsignaturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAsignaturasMouseEntered
        pAsignaturas.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pAsignaturasMouseEntered

    private void pAsignaturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAsignaturasMouseExited
        pAsignaturas.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pAsignaturasMouseExited

    private void pUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsuariosMouseClicked
        admin.showPanel(new pCRUD_Usuarios(), pAccion);
    }//GEN-LAST:event_pUsuariosMouseClicked

    private void pUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsuariosMouseEntered
        pUsuarios.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pUsuariosMouseEntered

    private void pUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsuariosMouseExited
        pUsuarios.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pUsuariosMouseExited

    private void pCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCursosMouseClicked
        admin.showPanel(new pCRUD_Cursos(), pAccion);
    }//GEN-LAST:event_pCursosMouseClicked

    private void pCursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCursosMouseEntered
        pCursos.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pCursosMouseEntered

    private void pCursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCursosMouseExited
        pCursos.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pCursosMouseExited

    private void pAsignarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAsignarMouseClicked
        admin.showPanel(new pAsignarDocentes(), pAccion);
    }//GEN-LAST:event_pAsignarMouseClicked

    private void pAsignarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAsignarMouseEntered
        pAsignar.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pAsignarMouseEntered

    private void pAsignarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAsignarMouseExited
        pAsignar.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pAsignarMouseExited

    private void lbCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarSesionMouseClicked
        this.dispose();
        new MYSQL().desconectar();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_lbCerrarSesionMouseClicked

    private void lbCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarSesionMouseEntered
        pSesion.setBackground(Color.red);
    }//GEN-LAST:event_lbCerrarSesionMouseEntered

    private void lbCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarSesionMouseExited
        pSesion.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_lbCerrarSesionMouseExited

    private void lbSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMouseExited
        pSalir.setBackground(new Color(238, 238, 238));
    }//GEN-LAST:event_lbSalirMouseExited

    private void lbSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMouseEntered
        pSalir.setBackground(Color.red);
    }//GEN-LAST:event_lbSalirMouseEntered

    private void lbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMouseClicked
        new MYSQL().desconectar();
        new App();
        App.deleteTempFile();
        System.exit(0);
    }//GEN-LAST:event_lbSalirMouseClicked

    private void pAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAdminMouseClicked
        admin.showPanel(new pCRUD_EstudiantesDocentesAdmins(1), pAccion);
    }//GEN-LAST:event_pAdminMouseClicked
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgImg;
    private javax.swing.JLabel lbCerrarSesion;
    private javax.swing.JLabel lbSalir;
    private javax.swing.JPanel pAccion;
    private javax.swing.JPanel pAdmin;
    private javax.swing.JPanel pAsignar;
    private javax.swing.JPanel pAsignaturas;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pCabeza;
    private javax.swing.JPanel pCursos;
    private javax.swing.JPanel pDocente;
    private javax.swing.JPanel pEstudiantes;
    private javax.swing.JPanel pSalir;
    private javax.swing.JPanel pSesion;
    private javax.swing.JPanel pUsuarios;
    private javax.swing.JLabel txtAs;
    private javax.swing.JLabel txtAsi;
    private javax.swing.JLabel txtCu;
    private javax.swing.JLabel txtDo;
    private javax.swing.JLabel txtEs;
    private javax.swing.JLabel txtUs;
    // End of variables declaration//GEN-END:variables
}
