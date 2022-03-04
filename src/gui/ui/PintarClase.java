package gui.ui;

import javax.swing.*;
import java.awt.*;

public class PintarClase {
    JFrame Ventana;
    PanelPaint panel;

    PintarClase(){
        Ventana=new JFrame("Para pintar");
        panel=new PanelPaint();
        Ventana.add(panel, BorderLayout.CENTER);
        Ventana.setSize(400,600);
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PintarClase();
    }
}
