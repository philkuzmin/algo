package Sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void sort() {

        int[] arr = new int[]{3, 6, 2, 4, 1, 10, 2322, 23, 4, 6, 2, 65};
        SelectionSort.sort(arr);
        assertThat(arr[0], is(1));
    }
}