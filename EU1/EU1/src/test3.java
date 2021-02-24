public class test3 {

    
    public static void main(String[] args) {


       

        int[] test = {5,4,6,8,5,4,3,8,9,10,17,43,22,67,34,23,2,4,67};
    
        int min = min1(test);

        System.out.println(min);
    
        

    }

    public static int min1(int[] element) throws IllegalArgumentException {
        if (element.length == 0)
            throw new IllegalArgumentException ("tom samling");
            
        // hör ihop med spårutskriften 2:
        int antalVarv = 1;
        
        int[] sekvens = element;
        int antaletPar = sekvens.length / 2;
        int antaletOparadeElement = sekvens.length % 2;
        int antaletTankbaraElement = antaletPar + antaletOparadeElement;
        int[] delsekvens = new int[antaletTankbaraElement];
        int i = 0;
        int j = 0;
        
        while(antaletPar > 0) {

            System.out.println (java.util.Arrays.toString (sekvens));


            // skilj ur en delsekvens med de tänkbara elementen
            i = 0;
            j = 0;
            while(j < antaletPar) {
                delsekvens[j++] = (sekvens[i] < sekvens[i + 1]) ? sekvens[i] : sekvens[i + 1];
                i += 2;
            }
            
            if(antaletOparadeElement == 1)
                delsekvens[j] = sekvens[sekvens.length -1];
            
            // utgå nu ifrån delsekvensensekvens = delsekvens;
            sekvens = delsekvens;
            antaletPar = antaletTankbaraElement /2;
            antaletOparadeElement = antaletTankbaraElement % 2;
            antaletTankbaraElement = antaletPar + antaletOparadeElement;
            
            // spårutskrift 1 –för att följasekvensen
            
            // spårutskrift 2 -för att avsluta loopen i förväg
            // (för att kunna se vad som händer i början)
            //if (antalVarv++ == 10)
            //    System.exit (0);
        }
            
        // sekvens[0] är det enda återstående tänkbara elementet
        //-det är det minsta elementetreturn sekvens[0];
        return sekvens[0];
    }    

}
