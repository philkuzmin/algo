package search;

public class Factorial {

    public static long factorial(int number) {

        if (number == 1) {
            return number;
        } else {
            return number * factorial(number - 1);
        }
    }

}
