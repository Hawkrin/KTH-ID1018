public class DenKorstasteVagen {

    // mellanstationer returnerar en vektor med de mellanstationer som finns på den kortaste
    // vägen. Ordningsnummer av den första mellanstationen finns på index1, och ordningsnummer
    //av den andra mellanstationen på index2 i vektorn.
    public static int[] mellanstationer (double[] a, double[][] b,double[] c) {

        //koden här
        double min = a[0]+b[0][0]+c[0]; //minsta längden. 
        int[] result = new int[2];
        double langd;
        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0; j < c.length; j++) {
                langd = (a[i] + b[i][j] + c[j]);
                if (langd < min) {
                    min = langd;
                    result[0] = i + 1;
                    result[1] = j + 1;
                }        
            }
        }   
            return result;
    }

    // langd returnerar längden av den kortaste vägen.
    public static double langd (double[] a, double[][] b, double[] c) {

        //koden här
        double min = a[0]+b[0][0]+c[0]; //minsta längden.
        double langd;
        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0; j < c.length; j++) {
                langd = (a[i] + b[i][j] + c[j]);
                if (langd < min) {
                    min = langd;
                   
                }        
            }
        }   
            return min;
    
    }
    
}
