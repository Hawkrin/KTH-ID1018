public class binarySearch {

    public static void main(String[] args) {

        int array[] = {1,3,5,8,11,12,15,35,67,89};
        int e = 3;
        System.out.println(binarysearch(array, e));
    }
    
    public static int binarysearch(int[] array, int e) {
    
        int elementPos = -1;
        int first = 0;
        int last = array.length-1;
        int middle = 0;
        boolean found = false;
        while(first<=last && !found) {
            middle = (first + last)/2;
            if(e == array[middle]) {
                elementPos = middle;
                found = true;
            }
            else if(e < array[middle]) {
                last = middle - 1;
            }
            else{
                first = middle + 1;
            }
        }
        return elementPos;
    }
}
