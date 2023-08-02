/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Edwin Lopez
 */
public abstract class CargarPanel {
    public void showPanel(JPanel p, JPanel panel){
        p.setSize(772,546);
        p.setLocation(0,0);
        panel.removeAll();
        panel.add(p, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }
}
