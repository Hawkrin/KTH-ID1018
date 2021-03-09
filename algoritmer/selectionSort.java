public class selectionSort {

    public static void main(String[] args) {

        int array[] = {1,5,4,6,6,2,4,6};

        System.out.println(selectinsort(array));
    }
    

    public static void selectionsort(int [] array) {
        int current = 0;
        int element = 0;
        for(int i = 0; i < array.length-1; i++) {
            current = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[current]) {
                    current = j;
                }
            }
            element = array[i];
            array[i] = array[current];
            array[current] = element;
        }
    }
}
