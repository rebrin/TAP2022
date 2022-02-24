package gui.ui;

import javax.swing.*;
import java.awt.*;

public class EJBorder {
    JFrame Ventana;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    //JPanel
    JPanel panelCentral;
    JLabel Etiqueta;
    JButton Boton;

    public EJBorder(){
        Ventana=new JFrame("BorderLayout");
        b1=new JButton("Botón GUI");
        b2=new JButton("Botón GUI");
        b3=new JButton("Botón GUI");
        b4=new JButton("Botón GUI");
        b5=new JButton("Botón GUI");
        Etiqueta=new JLabel("Etiqueta central");
        Boton=new JButton("Aceptar");
        panelCentral=new JPanel();
        panelCentral.add(Etiqueta);
        panelCentral.add(Boton);
        //construcción

        Ventana.add(b1, BorderLayout.NORTH);
        Ventana.add(b2,BorderLayout.SOUTH);
        Ventana.add(b3,BorderLayout.WEST);
        Ventana.add(b4,BorderLayout.EAST);
        Ventana.add(panelCentral,BorderLayout.CENTER);
        //visible
        Ventana.setSize(600,400);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new EJBorder();
    }

}
