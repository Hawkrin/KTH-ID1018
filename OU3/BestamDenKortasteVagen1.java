import java.util.*;

public class BestamDenKortasteVagen1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Hur många mellanstationer finns det U och V? ");
        int m = in.nextInt();
        int n = in.nextInt();

        double[] a = new double[m];
        double[][] b = new double[m][n];
        double[] c = new double[n];

        System.out.println("Längd mellan stationerna från Zon1 till Zon2");
        for (int i = 0; i < m; i++) {
            System.out.print("a" + (i + 1) + ": ");
            a[i] = in.nextDouble();
        }

        System.out.println("Längd mellan stationerna från Zon2 till Zon3");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("b" + (i + 1) + "" + (j + 1)+ ": ");
                b[i][j] = in.nextDouble();
            }
        }

        System.out.println("Längd mellan stationerna från Zon3 till Zon4");
        for (int j = 0; j < n; j++) {
            System.out.print("c" + (j+ 1) + ": " );
            c[j] = in.nextDouble();
        }

        int[] result = DenKorstasteVagen.mellanstationer(a, b, c);
        int mellanstationU = result[0];
        int mellanstationV = result[1];

        System.out.println();
        System.out.println("Den kortaste vägen är via stationerna U" + mellanstationU + " och V" + mellanstationV);
        System.out.println();
        System.out.println("Den kortaste vägen är " + DenKorstasteVagen.langd(a, b, c) + " enheter lång");
        System.out.println();
    }

  


    
}
