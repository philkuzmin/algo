package Sort;

public class SelectionSort {

    public static void sort(int[] source) {

        for (int i = 0; i < source.length - 1; i++) {

            int min = source[i];
            int pos=i;

            for (int j = i + 1; j < source.length; j++) {
                if (min > source[j]) {
                    min = source[j];
                    pos = j;
                }
            }

            source[pos] = source[i];
            source[i] = min;

        }
    }
}
