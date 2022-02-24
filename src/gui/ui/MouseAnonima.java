package gui.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAnonima {
    JFrame Ventana;
    JLabel Etiqueta;

    public MouseAnonima(){
        Ventana=new JFrame("Clase anonima");
        Etiqueta=new JLabel("etiqueta texto");
        //----crear la interfaz
        Ventana.setLayout(new FlowLayout());
        Ventana.add(Etiqueta);
        //---manejo evento anónimo
        Ventana.addMouseListener(new MouseAdapter() {
            //------cambiar esto por el evento mouseDragged--------------
            @Override
            public void mouseClicked(MouseEvent evento) {
                Etiqueta.setText("coord"+evento.getX()+":"+evento.getY());
            }
        });
        //tam y visibilidad
        Ventana.setSize(400,300);
        Ventana.setVisible(true);

    }

    public static void main(String[] args) {
        new MouseAnonima();
    }
}
