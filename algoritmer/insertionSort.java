public class insertionSort {


    public static void main(String[] args) {

        int array[] = {1,5,4,6,6,2,4,6};
        
        System.out.println(insertionsort(array));
    }


    public static void insertionsort(int[] array) {

        for(int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j>=0 && array[j] > current) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    
}



