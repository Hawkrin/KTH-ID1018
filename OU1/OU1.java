package Labbar;

import java.util.*; // Scanner, Locale

class  OU1 { 
    public static void main (String[] args) {
        System.out.println ("TEMPERATURER\n");

        // inmatningsverktyg
        Scanner in = new Scanner (System.in);
        in.useLocale (Locale.US);
        
        // mata in uppgifter om antalet veckor och antalet mätningar
        System.out.print ("antalet veckor: ");
        int antalVeckor = in.nextInt ();
        System.out.print ("antalet mätningar per vecka: ");
        int antalMatningarPerVecka = in.nextInt ();
        
        // plats att lagra temperaturer
        double[][] t = new double[antalVeckor][antalMatningarPerVecka];
        
        // mata in temperaturerna
        for (int vecka = 0; vecka < antalVeckor; vecka++) {
            System.out.println ("temperaturer - vecka " + (vecka+1) + ":");
            for (int matning = 0; matning < antalMatningarPerVecka; matning++)
            t[vecka][matning] = in.nextDouble ();
        }
        System.out.println ();
        
        // visa temperaturerna
        System.out.println ("temperaturerna:");
        for (int vecka = 0; vecka < antalVeckor; vecka++) {
            for (int matning = 0; matning < antalMatningarPerVecka; matning++)
            System.out.print (t[vecka][matning] + " ");
        System.out.println ();
        }
    
        System.out.println ();
        
       // den minsta, den största och medeltemperaturen – veckovis
        double[] minT = new double[antalVeckor];
        double[] maxT = new double[antalVeckor];
        double[] medelT = new double[antalVeckor];

        // koden ska skrivas här
        // Maxtempen för varje vecka.
        for(int vecka = 0; vecka < t.length; vecka++) {
            double maxTemp = t[vecka][0];
            for(int matning = 0; matning < antalMatningarPerVecka; matning++) {
                if(t[vecka][matning] > maxTemp) {
                    maxTemp = t[vecka][matning];
                }
            }
            maxT[vecka] = maxTemp;
        }
        
       // Mintempen för varje vecka.
        for(int vecka = 0; vecka < t.length; vecka++) {
            double minTemp = t[vecka][0];
            for(int matning = 0; matning < antalMatningarPerVecka; matning++) {
                if(t[vecka][matning] < minTemp) {
                    minTemp = t[vecka][matning];
                }
            }
            minT[vecka] = minTemp;
        }

        // Medelvärdet varje vecka.
        double medelVecka = 0;
        for(int vecka = 0; vecka < antalVeckor; vecka++) {
            medelVecka = 0;
           for(int matning = 0; matning < antalMatningarPerVecka; matning++) {
               medelVecka = medelVecka + t[vecka][matning];
            }
            medelT[vecka] = medelVecka/antalMatningarPerVecka;
        }

        // visa den minsta, den största och medeltemperaturen för varje vecka
        // koden ska skrivas här
        System.out.println("DETTA ÄR DOM MINSTA TEMPERATURERNA VARJE VECKA: ");

        for(int vecka = 0; vecka < antalVeckor; vecka++) {
            System.out.println("Minvärdet vecka " + (vecka+1) + " var " + minT[vecka] + " grader ");
        }
        System.out.println();

        System.out.println("DETTA ÄR DOM HÖGSTA TEMPERATURERNA VARJE VECKA: ");
        
        for(int vecka = 0; vecka < antalVeckor; vecka++) {
            System.out.println("Maxvärdet vecka " + (vecka+1) + " var " + maxT[vecka] + " grader ");
        }
        System.out.println();

        System.out.println("DETTA ÄR MEDELTEMPERATUREN VARJE VECKA: ");
        
        for(int vecka = 0; vecka < antalVeckor; vecka++) {
            System.out.println("Medelvärdet vecka " + (vecka+1) + " var " + medelT[vecka] + " grader ");
        }
        System.out.println();
      
        // den minsta, den största och medeltemperaturen - hela mätperioden
        double minTemp = minT[0];
        double maxTemp = maxT[0];
        double medelTemp = medelT[0];
        
        // koden ska skrivas här
        // STÖRSTA OCH MINSTA TEMPERATUREN FÖR HELA PERIODEN
        for(int vecka = 0; vecka < t.length; vecka++) {
            Arrays.sort(t[vecka]);

            if(t[vecka][0] < minTemp) minTemp = t[vecka][0];
            if(t[vecka][t[vecka].length - 1] > maxTemp) maxTemp = t[vecka][t[vecka].length - 1];
        }
        
        // MEDELTEMPERATUREN FÖR HELA MÄTPERIODEN
        double summa = 0;
        for(int vecka = 0; vecka < antalVeckor; vecka++) {
            for(int matning = 0; matning < antalMatningarPerVecka; matning++) {
              summa += t[vecka][matning];
            }
        }
        medelTemp = summa / (antalMatningarPerVecka * antalVeckor);
        
        // visa den minsta, den största och medeltemperaturen i hela mätperioden
        // koden ska skrivas här
        System.out.println("Mintemperaturen under hela mätperioden  " + minTemp);
        System.out.println();
        System.out.println("Maxtemperaturen under hela mätperioden " + maxTemp);  
        System.out.println();
        System.out.println("Medeltemperaturen under hela mätperioden " + medelTemp);
    
    }   
}




