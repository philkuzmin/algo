package Sort;

public class QuickSort {

    private int[] array;

    public void sort(int[] array) {

        this.array = array;

        if (array.length == 0) {
            return;

        } else {

            quickSort(0, array.length - 1);

        }

    }

    private void quickSort(int start, int end) {

        int pivot = start + (end - start) / 2;
        int i = start;
        int j = end;

        while (i <= j) {

            while (array[i] < array[pivot]) {
                i++;
            }

            while (array[j] > array[pivot]) {
                j--;
            }

            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }

        }

        if (start < j) {
            quickSort(start, j);
        }

        if (i < end) {
            quickSort(pivot, end);
        }
    }

    private void swap(int i, int j) {

        int element = array[i];
        array[i] = array[j];
        array[j] = element;
    }

}
