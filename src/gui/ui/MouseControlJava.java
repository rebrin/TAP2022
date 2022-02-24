package gui.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseControlJava implements MouseListener, MouseMotionListener {
    JFrame Ventana;
    JLabel Etiqueta;

    public MouseControlJava(){
        //contrucción de interfaz
        Ventana=new JFrame("Manejo Raton");
        Etiqueta=new JLabel("Mensaje:");
        //añadir a contenedor
        Ventana.setLayout(new FlowLayout());
        Ventana.add(Etiqueta);
        //añadimos los listeners
        Ventana.addMouseListener(this);
        Ventana.addMouseMotionListener(this);
        Ventana.setSize(400,300);
        Ventana.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("haz dado click!!"+e.getX()+":"+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("soltado el boton del mouse");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entrando en una zona");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("saliendo de la zona");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Arrastrando el raton");
    }

    @Override
    public void mouseMoved(MouseEvent e) { }

    public static void main(String[] args) {
        new MouseControlJava();
    }
}
