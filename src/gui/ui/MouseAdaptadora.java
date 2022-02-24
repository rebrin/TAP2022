package gui.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdaptadora {
    JFrame Ventana;
    JLabel Etiqueta;

    public  MouseAdaptadora(){
        //construyo interfaz
        Ventana=new JFrame("Clase adaptadora");
        Etiqueta=new JLabel("Etiqueta de texto");
        //añado elementos al contenedor
        Ventana.setLayout(new FlowLayout());
        Ventana.add(Etiqueta);
        Ventana.addMouseListener(new myAdaptadora());
        //set ventana
        Ventana.setSize(400,300);
        Ventana.setVisible(true);
    }
    //clase adaptadora
    class myAdaptadora extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            //super.mouseClicked(e);
            Etiqueta.setText("click "+e.getX()+":"+e.getY());
        }
    }

    public static void main(String[] args) {
        new MouseAdaptadora();
    }
}
