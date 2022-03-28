package librerias;

import java.sql.*;

public class InsertaDatosAlumnos {
    Connection con;
    Statement stm;
    ResultSet rst;
    final String URL="jdbc:mysql://localhost/pruebastap2022";
    public InsertaDatosAlumnos(){
        try {
            String ins="DELETE FROM alumnos WHERE id=5";
            con=DriverManager.getConnection(URL,"root","");
            stm=con.createStatement();
            int filas=stm.executeUpdate(ins);
            System.out.println("Filas afectadas:"+filas);

        } catch (SQLException e) {//todo lo que sale mal
            System.out.println("error de conexión");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new InsertaDatosAlumnos();
    }

}
