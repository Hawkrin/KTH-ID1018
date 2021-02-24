package Labbar;
import java.util.*;

public class EnTriangelOchDessCirklar {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        //Inmatning av triangelns sidor
        System.out.println("Ange längderna på en triangels 3 sidor");
        double sida1 = in.nextDouble();
        double sida2 = in.nextDouble();
        double sida3 = in.nextDouble();
        System.out.println();
      
        //OMKRETS TRIANGEL
        double Omkrets = Triangel.omkrets(sida1,sida2,sida3);
        System.out.println("Triangelns omkrets är " + Omkrets + "cm");
        System.out.println();

        //Radie på inskriven cirkel
        double radie1 = Triangel.Inskriven_cirkel(sida1,sida2,sida3);
        double avrundning = Triangel.runda_av(radie1);
        System.out.println("Radien på den inskrivna cirkeln är " + radie1 + "cm" + " ≈ " + avrundning + "cm");
        System.out.println();

        //Radie på omskriven cirkel
        double radie2 = Triangel.Omskriven_cirkel(sida1,sida2,sida3); 
        avrundning = Triangel.runda_av(radie2);
        System.out.println("Radien på den omskrivna cirkeln är " + radie2 + "cm" + " ≈ " + avrundning + "cm");
        System.out.println();

      
    }
    
}
