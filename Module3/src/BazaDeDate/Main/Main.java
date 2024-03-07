package BazaDeDate.Main;
import BazaDeDate.ConexiuneBazaDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDate conn1 = ConexiuneBazaDate.getInstance("Baza 1", 4, "linkConectare1");
        ConexiuneBazaDate conn2 = ConexiuneBazaDate.getInstance("Baza 2", 2, "linkConectare2");

        System.out.println(conn1);
        System.out.println(conn2);

        conn1.setNumeBaza("NumeDeBazaNou");
        System.out.println(conn1);



    }
}