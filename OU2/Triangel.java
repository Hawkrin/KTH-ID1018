package Labbar;

public class Triangel {

    //I denna klass så finns det olika matematiska metoder för trianglar.
    //Klassen innehåller metoder för:
    //area, omkrets, median, bisektris(längd), radie av omskriven cirkel och radie av inskriven cirkel.

    //Triangel Area
    public static double area(double length, double height) {

        double area = (length * height)/2;

        return area;

    }

    //Triangel Omkrets
    public static double omkrets(double sida1, double sida2, double sida3) {

        double omkrets = sida1 + sida2 + sida3;

        return omkrets;
    }

    //Median
    //Om vi tänker oss triangeln med vinklar från vänster -> höger(A,B,C), Så utgår vi här från sida a
    public static double median1(double sida1, double sida2, double sida3) {
        
        double b = 2;
        double median = Math.sqrt((2*(Math.pow(sida1, b)+2*(Math.pow(sida2, b)-Math.pow(sida3, b)/4))));

        return median;  

    }
    
    //Median
    //Om vi tänker oss triangeln med vinklar från vänster -> höger(A,B,C), Så utgår vi här från sida b
    public static double median2(double sida1, double sida2, double sida3) {
        
        double b = 2;
        double median = Math.sqrt((2*(Math.pow(sida1, b)+2*Math.pow(sida3, b)-(Math.pow(sida2, b)/4))));

        return median;

    }

    //Median
    //Om vi tänker oss triangeln med vinklar från vänster -> höger(A,B,C), Så utgår vi här från sida c
    public static double median3(double sida1, double sida2, double sida3) {
        
        double b = 2;
        double median = Math.sqrt((2*(Math.pow(sida3, b)+2*(Math.pow(sida2, b)-Math.pow(sida1, b)/4))));

        return median; 

    }

    //Bisektris
    //Om vi tänker oss triangelns vinklar från vänster -> höger(A,B,C), Så utgår vi här från vinkel C
    public static double bisektris1(double sida1, double sida2, double vinkel3) {

        vinkel3 = Math.toRadians(vinkel3);
        double bisektris = 2 * sida1 * sida2 * Math.cos(vinkel3/2);
        double bis = bisektris / (sida1+sida2);

        return bis;
    }

    //Bisektris
    //Om vi tänker oss triangelns vinklar från vänster -> höger(A,B,C), Så utgår vi här från vinkel B
    public static double bisektris2(double sida1, double sida3, double vinkel2) {

        vinkel2 = Math.toRadians(vinkel2);
        double bisektris = 2 * sida1 * sida3 * Math.cos(vinkel2/2);
        double bis = bisektris / (sida1+sida3);

        return bis;
    }

    //Bisektris
    //Om vi tänker oss triangelns vinklar från vänster -> höger(A,B,C), Så utgår vi här från vinkel A
    public static double bisektris3(double sida2, double sida3, double vinkel1) {

        vinkel1 = Math.toRadians(vinkel1);
        double bisektris = 2 * sida2 * sida3 * Math.cos(vinkel1/2);
        double bis = bisektris / (sida2+sida3);

        return bis;
    }

    //Radie inskriven cirkel i triangel
    public static double Inskriven_cirkel(double sida1, double sida2, double sida3) {

        double s = ((sida1+sida2+sida3)/2);
        double area = Math.sqrt(s*(s-sida1)*(s-sida2)*(s-sida3));
        double radie = (area/((sida1+sida2+sida3)*0.5));

        return radie;

    }

    //Radie omskriven cirkel runt triangel
    public static double Omskriven_cirkel(double sida1, double sida2, double sida3) {

        double s = ((sida1+sida2+sida3)/2);
        double area = Math.sqrt(s*(s-sida1)*(s-sida2)*(s-sida3));
        double radie = ((sida1*sida2*sida3)/(4*area));

        return radie;
    }

    //avrundning till 2 decimaltal
    public static double runda_av(double x) {

        double runda_av = (double) Math.round(x*100)/100;

        return runda_av;
    }

}
