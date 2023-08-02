/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package IGU.Estudiante;

import Logica.Usuarios.Acciones.Estudiante;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin Lopez
 */
public class pMatricula extends javax.swing.JPanel {

    /**
     * Creates new form pMatricula
     */
    private DefaultListModel modelo = new DefaultListModel();
    private DefaultListModel modelo1 = new DefaultListModel();
    private int idU;
    private int idA;
    private Logica.Usuarios.Administradores admin = new Logica.Usuarios.Administradores();
    private Estudiante es = new Estudiante();

    public pMatricula(int id) {
        initComponents();
        this.setIdU(id);
        this.listaA();
        this.listaB();
    }

    private void listaA() {
        ltMatriculas.setModel(modelo);
        modelo.removeAllElements();

        for (int i = 0; i < es.matriculas(this.getIdU()).size(); i++) {
            modelo.addElement(es.matriculas(this.getIdU()).get(i));
        }

    }

    private void listaB() {
        ltMatriculado.setModel(modelo1);
        modelo1.removeAllElements();
        for (int i = 0; i < es.matriculado(this.getIdU()).size(); i++) {
            modelo1.addElement(es.matriculado(this.getIdU()).get(i));
        }
    }

    public int getIdU() {
        return this.idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public int getIdA() {
        return this.idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMatricularse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltMatriculas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ltMatriculado = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(772, 546));

        btnMatricularse.setText("Matricularse");
        btnMatricularse.setEnabled(false);
        btnMatricularse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularseActionPerformed(evt);
            }
        });

        ltMatriculas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ltMatriculas.setName(""); // NOI18N
        ltMatriculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltMatriculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ltMatriculas);

        ltMatriculado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ltMatriculado.setEnabled(false);
        jScrollPane2.setViewportView(ltMatriculado);

        jLabel1.setText("ASIGNATURAS DISPONIBLES");

        jLabel2.setText("YA PERTENECES A: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(btnMatricularse)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnMatricularse)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ltMatriculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltMatriculasMouseClicked
        if (!es.matriculas(this.getIdU()).isEmpty()) {
            String n = ltMatriculas.getSelectedValue();
            this.admin.setId("asignaturas", n);
            this.setIdA(admin.getId());
            btnMatricularse.setEnabled(true);
        }
    }//GEN-LAST:event_ltMatriculasMouseClicked

    private void btnMatricularseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularseActionPerformed
        es.matricularse(this.getIdU(), this.getIdA());
        this.listaA();
        this.listaB();
        JOptionPane.showMessageDialog(null, "Matriculacion exitosa");

    }//GEN-LAST:event_btnMatricularseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatricularse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> ltMatriculado;
    private javax.swing.JList<String> ltMatriculas;
    // End of variables declaration//GEN-END:variables
}