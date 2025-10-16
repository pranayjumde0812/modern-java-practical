package com.learn.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();


        /**
         * With Java 8
         * () -> {};
         */

        // 1. Lambda with {}
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2.0");
        };

        new Thread(runnableLambda).start();

        // 2. For one line code no need of {}
        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 2.1");

        new Thread(runnableLambda1).start();


        // 3. No need to create Runnable variable and then pass into thread, we can directly write it inside it.
        new Thread(() -> System.out.println("Inside Runnable 2.2")).start();


        // 1. Lambda with {} for multiple statements
        Runnable runnableLambda5 = () -> {
            System.out.println("Inside Runnable 2.3.1");
            System.out.println("Inside Runnable 2.3.2");
        };

        new Thread(runnableLambda5).start();
    }
}
