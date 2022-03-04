package gui.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PanelPaint extends JPanel implements MouseMotionListener, MouseListener {
    int x,y,xfin,yfin;
    int alto,ancho;


    PanelPaint(){
        super();
        this.addMouseMotionListener(this);
        this.addMouseListener(this);

    }

    @Override
    public void paintComponent(Graphics g) {
        //super.paintComponent(g); //limpiar la pantalla
        g.fillRect(Math.min(x,xfin),Math.min(y,yfin),ancho,alto);
        //limpiar los valores
    }

    @Override
    public void mouseDragged(MouseEvent e) {
      //repintar
        ancho=Math.abs(e.getX()-x);
        alto=Math.abs(e.getY()-y);
        xfin=e.getX();
        yfin=e.getY();
        repaint();
        System.out.println(x+":"+y+" ancho:"+ancho+":alto"+alto);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        System.out.printf("punto inicial");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ancho=Math.abs(e.getX()-x);
        alto=Math.abs(e.getY()-y);
        System.out.printf("punto final");
        xfin=e.getX();
        yfin=e.getY();
        ancho=alto=x=y=0;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
