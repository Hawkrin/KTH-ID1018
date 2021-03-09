public class linearSeach {

    public static void main(String[] args) {

        int array[] = {1,5,4,6,6,2,4,6};
        int e = 2;
        System.out.println(linearsearch(array, e));
    }
    
    public static int linearsearch(int[] array, int e) {

        int first = 0;
        int last = array.length-1;
        int aktuell = first;
        while(aktuell<=last && array[aktuell] != e)  {
            aktuell++;
        }
        if(aktuell > last) {
            e = -1;
        }
        return aktuell;
    }
}
