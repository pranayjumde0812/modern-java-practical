package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /**
         * Prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                // 0 -> o1 == o2
                // 1 -> o1 > o2
                // -1 -> o1 < o2
            }
        };

        System.out.println("Result of the Comparator 1 is : " + comparator.compare(3, 7));


        /**
         * With Java 8 Lambda
         */

        // 1.
        Comparator<Integer> comparatorlambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("Result of the Comparator 2 is : " + comparatorlambda.compare(10, 7));

        // 2.
        Comparator<Integer> comparatorlambda1 = (a, b) -> a.compareTo(b);

        System.out.println("Result of the Comparator 3 is : " + comparatorlambda1.compare(10, 10));

        // 3.
        Comparator<Integer> comparatorlambda2 = Integer::compareTo;

        System.out.println("Result of the Comparator 3 is : " + comparatorlambda2.compare(11, 10));

        // 4.
        Comparator<Integer> comparatorlambda3 = Comparator.naturalOrder();

        System.out.println("Result of the Comparator 3 is : " + comparatorlambda3.compare(11, 112));


    }


}
