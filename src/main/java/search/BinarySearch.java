package search;

public class BinarySearch {

//    static int search(int[] array, int number) {
//
//        int low = 0;
//        int high = array.length - 1;
//        int mid = (high - low) / 2;
//        int guess = array[mid];
//
//        if (array[high] == number) return high;
//        if (array[low] == number) return low;
//
//        while (guess != number) {
//            if (guess > number) {
//                high = mid;
//            } else {
//                low = mid;
//            }
//            mid = (high - low) / 2 + low;
//            guess = array[mid];
//        }
//
//        return mid;
//    }

    static int search(int[] array, int number) {

        int low = 0;
        int high = array.length - 1;
        int mid;
        int guess;

        while (low <= high) {
            mid = (high - low) / 2 + low;
            guess = array[mid];
            if (guess == number) return mid;

            if (guess > number) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return -1;
    }

}
