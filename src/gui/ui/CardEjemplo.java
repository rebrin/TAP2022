package gui.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardEjemplo {
    //primer panel
    final String PANEL1="panel-1";
    JPanel card1;
    JLabel Etiqueta1;
    JButton BNext,BPrevius;

    //panel 2
    final String PANEL2="panel-2";
    JPanel card2;
    JTextField JTFNombre;
    JLabel Etiqueta2;
    JButton BNext2,BPrevius2;

    //panel Princ
    JFrame Ventana;
    JPanel cards;

    public CardEjemplo(){
        Ventana =new JFrame("CardsLayout");
        cards=new JPanel(new CardLayout());//card principal
        //------------------CARD 1-------------------------
        Etiqueta1=new JLabel("Esta es la interfaz #1");
        BNext=new JButton("Siguiente");
        BPrevius=new JButton("anterior");
        card1=new JPanel();
        card1.add(Etiqueta1);
        card1.add(BNext);
        card1.add(BPrevius);
        BNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl= (CardLayout) cards.getLayout();
                cl.next(cards);
            }
        });

        BPrevius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl= (CardLayout) cards.getLayout();
                cl.previous(cards);
            }
        });
        /*------------Card 2-------------------*/
        Etiqueta2=new JLabel("Usuario");
        JTFNombre=new JTextField("Nombre");
        BNext2=new JButton("siguiete 2");
        BPrevius2=new JButton("anterior 2");
        card2=new JPanel();
        card2.add(Etiqueta2);
        card2.add(JTFNombre);
        card2.add(BNext2);
        card2.add(BPrevius2);
        BNext2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl= (CardLayout) cards.getLayout();
                cl.next(cards);
            }
        });
        BPrevius2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl= (CardLayout) cards.getLayout();
                cl.previous(cards);
            }
        });
        //------------PANEL PRINCIPAL-------------------------
        cards.add(card1,PANEL1);
        cards.add(card2,PANEL2);
        Ventana.add(cards,BorderLayout.CENTER);
        Ventana.setSize(400,300);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new CardEjemplo();
    }
}
