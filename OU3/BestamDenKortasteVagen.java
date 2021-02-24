public class BestamDenKortasteVagen {

    public static void main(String[] args) {
    
       
        double[] a = {6, 4, 5};
        double[][] b = {{4, 5, 7, 13}, {10, 4, 3, 9}, {14, 8, 5, 3}};
        double[] c = {8, 6, 4, 7};

        int[] result = DenKorstasteVagen.mellanstationer(a, b, c);
        int mellanstationU = result[0];
        int mellanstationV = result[1];

        System.out.println("Den kortaste vägen är via stationerna U" + mellanstationU + " och V" + mellanstationV);
        System.out.println();
        System.out.println("Den kortaste vägen är " + DenKorstasteVagen.langd(a, b, c) + " enheter lång");
        System.out.println();
    }  
    
}
