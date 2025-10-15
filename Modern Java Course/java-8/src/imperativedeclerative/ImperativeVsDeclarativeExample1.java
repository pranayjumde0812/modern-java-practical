package imperativedeclerative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /**
         * Imperative - how style of programming
         */

        int sum = 0;
        for (int i = 0; i <= 100; i++) {

            sum += i;
        }

        System.out.println("Sum using Imperative Approach : " + sum);

        /**
         * Declarative - how style of programming
         */

        int sum1 = IntStream.rangeClosed(0, 100)
                .parallel()
                .sum();

        System.out.println("Sum using Declarative Approach : " + sum1);
    }
}
