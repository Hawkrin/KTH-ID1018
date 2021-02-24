import java.util.*;

public class test {

    public static void main(String[] args) {

        int[] test = {5,4,6,8,5,4,3,8,9,10,17,43,22,67,34,23,2,4,67};
        System.out.println(Arrays.toString(test));
        
        System.out.println("\nDet minsta elementet i mängden är: " + EU1.min(test) + "\n");
    }    
}

/*  FEL1

    {2,4,6,8,5,4,3,8,9,10,17,43,22,67,34,23};

    {2,6,4,3,9,17,22,23}
    antaletpar = 16/2 = 8
    antaletOparade = 16%2 = 0
    antaletTankbaraElement = 8 + 0 = 8

    {2,3,9,22}
    antaletpar = 8/2 = 4
    antaletOparade = 8%2 = 0
    antaletTankbaraElement = 4 + 0 = 4

    {2,9}
    antaletpar = 4/2 = 2
    antaletOparade = 4%2 = 0
    antaletTankbaraElement = 4 + 0 = 4

    {2}
    antaletpar = 2/2 = 1
    antaletOparade = 2%2 = 0
    antaletTankbaraElement = 1 + 0 = 1

*/

/*    FEL2

    {5,4,6,8,5,4,3,8,9,10,17,43,22,67,34,23,2,4,67};

    {4,6,4,3,9,17,22,23,2,67}
    antaletpar = 19/2 = 9
    antaletOparade = 19%2 = 1
    antaletTankbaraElement = 9 + 1 = 10

    {4,3,9,22,2}
    antaletpar = 10/2 = 5
    antaletOparade = 10%2 = 0
    antaletTankbaraElement = 5 + 0 = 5

    {3,9,2}
    antaletpar = 5/2 = 2
    antaletOparade = 5%2 = 1
    antaletTankbaraElement = 2 + 1 = 3

    {3,2}
    antaletpar = 3/2 = 1
    antaletOparade = 3%2 = 1
    antaletTankbaraElement = 1 + 1 = 2

    {2}
    antaletpar = 2/2 = 1
    antaletOparade = 2%2 = 0
    antaletTankbaraElement = 1 + 0 = 1

*/

