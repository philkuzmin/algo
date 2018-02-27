package Sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sort() {

        int[] array = new int[]{3,30, 2, 9, 6, 2, 11};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        assertThat(array[0], is(2));

    }
}