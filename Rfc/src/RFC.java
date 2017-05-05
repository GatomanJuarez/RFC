
import javax.swing.JOptionPane;

public class RFC {

    public static void main(String args[]) {
        String v = null;
        int x;
        String nom = JOptionPane.showInputDialog("Nombre");
        nom.substring(0, 1);
        /* Leticia */
        String pater = JOptionPane.showInputDialog("Paterno");
        pater.substring(0, 1);

        for (x = 1; x < pater.length(); x++) {
            v = pater.substring(x, x + 1);
            switch (v) {
                /* if (v.equals("a") || v.equals("e") ||
                                                             v.equals("i") || v.equals("o")  ||
                                                             v.equals("u"))
                                                             {
                                                              x=pater.length()
                                                             } */
                case "a":
                    x = pater.length();
                    break;
                case "e":
                    x = pater.length();

                    break;
                case "i":
                    x = pater.length();

                    break;
                case "o":
                    x = pater.length();

                    break;
                case "u":
                    x = pater.length();

                    break;

            }
        }
        String ma = JOptionPane.showInputDialog("Materno");
        ma.substring(0, 1);
        String dia = JOptionPane.showInputDialog("Dia de nacimiento");
        dia.substring(0, 2);
        String mes = JOptionPane.showInputDialog("Mes de nacimiento");
        mes.substring(0, 2);
        String año = JOptionPane.showInputDialog("Año de nacimiento");
        año.substring(2, 4);

        System.out.print("tu rfc es " + pater.substring(0, 1) + v + ma.substring(0, 1) + nom.substring(0, 1) + año.substring(2, 4)
                + mes.substring(0, 2) + dia.substring(0, 2));

        /*  split ("",1); /* extrae por partes 
    substring ();                extrae por cadenas 
    
    String n = nombre.split("",1); 
                  /* Sacar una letra Nombres no Maria,Gpe,Jose,Angel 
         
         
         upperCase()
         lo cambia a mayusculas.
         
         lowerCase()
         lo cambia a minusculas
         */
    }
}
