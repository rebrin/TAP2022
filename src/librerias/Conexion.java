package librerias;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Conexion {
    JFrame ventana;
    JTextArea text;
    public Conexion(){
        ventana=new JFrame("conexiones");
        text=new JTextArea(40,40);
        ventana.add(text, BorderLayout.CENTER);
        Connection con;
        Statement stm;
        ResultSet rst;
        String UrlConnection="jdbc:mysql://localhost/pruebastap2022";
        try {
            //conexion realizada
            con= DriverManager.getConnection(UrlConnection,"root","");
            //Consulta
            String Query="select * from alumnos";
            stm=con.createStatement();
            //obtiene resultados
            rst=stm.executeQuery(Query);
            String cadena="";
            while (rst.next()){
                cadena+=rst.getInt("id")+" "+
                        rst.getString("nombre")+" "+
                        rst.getString("apellido")+" "+
                        rst.getString("n_control")+"\n";
            }
            text.setText(cadena);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setVisible(true);
            ventana.setSize(800,600);

        } catch (SQLException e) {
            System.out.println("Error fatal de conexion");
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Conexion();
    }
}
