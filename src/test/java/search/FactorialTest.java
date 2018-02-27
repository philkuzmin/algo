package search;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorialTest() {

        assertThat(Factorial.factorial(5), is(120L));
        assertThat(Factorial.factorial(1), is(1L));
        assertThat(Factorial.factorial(10), is(3628800L));
    }
}