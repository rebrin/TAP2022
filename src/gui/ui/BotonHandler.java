package gui.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonHandler implements ActionListener {
    //atributo de clase
    JTextField TfNombre;
    public BotonHandler(JTextField nombre){
        TfNombre=nombre;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre=TfNombre.getText();
        System.out.println("hola "+nombre);
        JOptionPane.showMessageDialog(null,"hola "+nombre+":"+nombre.length());
    }
}
