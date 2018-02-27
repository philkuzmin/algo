package search;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void searchTest() {

        int[] array = new int[]{1, 3, 5, 6, 8, 11, 34, 55, 100, 200};

        assertThat(BinarySearch.search(array, 5), is(2));
        assertThat(BinarySearch.search(array, 3), is(1));
        assertThat(BinarySearch.search(array, 100), is(8));
        assertThat(BinarySearch.search(array, 200), is(9));
        assertThat(BinarySearch.search(array, 1), is(0));
        assertThat(BinarySearch.search(array, 10), is(-1));
    }
}