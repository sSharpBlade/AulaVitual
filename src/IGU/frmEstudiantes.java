/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import IGU.Estudiante.pActividades;
import IGU.Estudiante.pCursos;
import IGU.Estudiante.pMatricula;
import IGU.Estudiante.pNotasA;
import IGU.Estudiante.pPerfil;
import Logica.App;
import Logica.MYSQL;
import Logica.Modelo.IdUsuario;
import Logica.Modelo.Usuario;
import java.awt.Color;
import Logica.Usuarios.Estudiantes;
import javax.swing.JPanel;

/**
 *
 * @author yepez
 */
public class frmEstudiantes extends javax.swing.JFrame {

    private Estudiantes es = new Estudiantes();
    private IdUsuario idu = Usuario.idU;
    /**
     * Creates new form frmEstudiantes
     */
    
    public Estudiantes getEs() {
        return this.es;
    }

    public void setEs(Estudiantes es) {
        this.es = es;
    }

    public JPanel getpAccion() {
        return this.pAccion;
    }

    public void setpAccion(JPanel pAccion) {
        this.pAccion = pAccion;
    }

    public frmEstudiantes() {
        initComponents();
        this.setLocationRelativeTo(null);       
        this.idu.getId();
        es.InfoPersonal(this.idu.getId());
    }
    private int xMouse, yMouse;
    
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
        pPresentacion = new javax.swing.JPanel();
        lbNombres = new javax.swing.JLabel();
        pBotones = new javax.swing.JPanel();
        pCursos = new javax.swing.JPanel();
        txtDo = new javax.swing.JLabel();
        pActividades = new javax.swing.JPanel();
        txtEs = new javax.swing.JLabel();
        pNotas = new javax.swing.JPanel();
        txtNote = new javax.swing.JLabel();
        pMatricularse = new javax.swing.JPanel();
        txtAs = new javax.swing.JLabel();
        pPerfil = new javax.swing.JPanel();
        txtUs = new javax.swing.JLabel();
        pAccion = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("frmEstudiantes"); // NOI18N
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
                .addGap(0, 888, Short.MAX_VALUE)
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

        pPresentacion.setBackground(new java.awt.Color(255, 28, 28));

        lbNombres.setBackground(new java.awt.Color(255, 28, 28));
        lbNombres.setFont(new java.awt.Font("KG Red Hands", 0, 12)); // NOI18N
        lbNombres.setForeground(new java.awt.Color(255, 255, 255));
        lbNombres.setText("Bienvenido/a !!!");
        lbNombres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNombresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pPresentacionLayout = new javax.swing.GroupLayout(pPresentacion);
        pPresentacion.setLayout(pPresentacionLayout);
        pPresentacionLayout.setHorizontalGroup(
            pPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        pPresentacionLayout.setVerticalGroup(
            pPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(pPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 45, 120, 40));

        pBotones.setOpaque(false);
        pBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 20));

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

        txtDo.setBackground(new java.awt.Color(246, 246, 246));
        txtDo.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtDo.setForeground(new java.awt.Color(255, 255, 255));
        txtDo.setText("CURSOS");
        pCursos.add(txtDo);

        pBotones.add(pCursos);

        pActividades.setBackground(new java.awt.Color(215, 35, 35));
        pActividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pActividades.setPreferredSize(new java.awt.Dimension(240, 40));
        pActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pActividadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pActividadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pActividadesMouseExited(evt);
            }
        });
        pActividades.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtEs.setBackground(new java.awt.Color(246, 246, 246));
        txtEs.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtEs.setForeground(new java.awt.Color(255, 255, 255));
        txtEs.setText("ACTIVIDADES");
        pActividades.add(txtEs);

        pBotones.add(pActividades);

        pNotas.setBackground(new java.awt.Color(215, 35, 35));
        pNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pNotas.setPreferredSize(new java.awt.Dimension(240, 40));
        pNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pNotasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pNotasMouseExited(evt);
            }
        });
        pNotas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtNote.setBackground(new java.awt.Color(246, 246, 246));
        txtNote.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtNote.setForeground(new java.awt.Color(255, 255, 255));
        txtNote.setText("NOTAS");
        pNotas.add(txtNote);

        pBotones.add(pNotas);

        pMatricularse.setBackground(new java.awt.Color(215, 35, 35));
        pMatricularse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pMatricularse.setPreferredSize(new java.awt.Dimension(240, 40));
        pMatricularse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMatricularseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pMatricularseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pMatricularseMouseExited(evt);
            }
        });
        pMatricularse.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtAs.setBackground(new java.awt.Color(246, 246, 246));
        txtAs.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtAs.setForeground(new java.awt.Color(255, 255, 255));
        txtAs.setText("MATRICULA");
        pMatricularse.add(txtAs);

        pBotones.add(pMatricularse);

        pPerfil.setBackground(new java.awt.Color(215, 35, 35));
        pPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pPerfil.setPreferredSize(new java.awt.Dimension(240, 40));
        pPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pPerfilMouseExited(evt);
            }
        });
        pPerfil.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        txtUs.setBackground(new java.awt.Color(246, 246, 246));
        txtUs.setFont(new java.awt.Font("KG Red Hands", 0, 14)); // NOI18N
        txtUs.setForeground(new java.awt.Color(255, 255, 255));
        txtUs.setText("PERFIL");
        pPerfil.add(txtUs);

        pBotones.add(pPerfil);

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

        bgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/IMG/Estudiantes.png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(bgImg, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(bgImg, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCursosMouseClicked
        pAccion.hide();
        pAccion.show();
        es.showPanel(new pCursos(this.idu.getId()), pAccion);
    }//GEN-LAST:event_pCursosMouseClicked

    private void pCursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCursosMouseEntered
        pCursos.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pCursosMouseEntered

    private void pCursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCursosMouseExited
        pCursos.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pCursosMouseExited

    private void pActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pActividadesMouseClicked
        pAccion.hide();
        pAccion.show();
        es.showPanel(new pActividades(this.idu.getId()), pAccion);
    }//GEN-LAST:event_pActividadesMouseClicked

    private void pActividadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pActividadesMouseEntered
        pActividades.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pActividadesMouseEntered

    private void pActividadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pActividadesMouseExited
        pActividades.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pActividadesMouseExited

    private void pMatricularseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMatricularseMouseClicked
        pAccion.hide();
        pAccion.show();
        es.showPanel(new pMatricula(this.idu.getId()), pAccion);
    }//GEN-LAST:event_pMatricularseMouseClicked

    private void pMatricularseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMatricularseMouseEntered
        pMatricularse.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pMatricularseMouseEntered

    private void pMatricularseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMatricularseMouseExited
        pMatricularse.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pMatricularseMouseExited

    private void pPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPerfilMouseClicked
        pAccion.hide();
        pAccion.show();
        es.showPanel(new pPerfil(this.idu.getId()), pAccion);
    }//GEN-LAST:event_pPerfilMouseClicked

    private void pPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPerfilMouseEntered
        pPerfil.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pPerfilMouseEntered

    private void pPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPerfilMouseExited
        pPerfil.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pPerfilMouseExited

    private void lbNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNombresMouseClicked
        pAccion.hide();
    }//GEN-LAST:event_lbNombresMouseClicked

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
        pSalir.setBackground(new Color(238, 238, 238));
    }//GEN-LAST:event_lbSalirMouseExited

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

    private void pCabezaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCabezaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pCabezaMouseDragged

    private void pCabezaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCabezaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pCabezaMousePressed

    private void pNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNotasMouseClicked
        pAccion.hide();
        pAccion.show();
        es.showPanel(new pNotasA(), pAccion);
    }//GEN-LAST:event_pNotasMouseClicked

    private void pNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNotasMouseEntered
        pNotas.setBackground(new Color(197, 0, 0));
    }//GEN-LAST:event_pNotasMouseEntered

    private void pNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNotasMouseExited
        pNotas.setBackground(new Color(215, 35, 35));
    }//GEN-LAST:event_pNotasMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgImg;
    private javax.swing.JLabel lbCerrarSesion;
    private javax.swing.JLabel lbNombres;
    private javax.swing.JLabel lbSalir;
    private javax.swing.JPanel pAccion;
    private javax.swing.JPanel pActividades;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pCabeza;
    private javax.swing.JPanel pCursos;
    private javax.swing.JPanel pMatricularse;
    private javax.swing.JPanel pNotas;
    private javax.swing.JPanel pPerfil;
    private javax.swing.JPanel pPresentacion;
    private javax.swing.JPanel pSalir;
    private javax.swing.JPanel pSesion;
    private javax.swing.JLabel txtAs;
    private javax.swing.JLabel txtDo;
    private javax.swing.JLabel txtEs;
    private javax.swing.JLabel txtNote;
    private javax.swing.JLabel txtUs;
    // End of variables declaration//GEN-END:variables
}
