package com.company;

public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock(0);
        Manufacturer manufacturer = new Manufacturer(stock);
        Consumer consumer = new Consumer(stock);

        for (int i = 1; i <= 5; i++) {

            manufacturer.run();
            consumer.run();

        }
//        Thread th1 = new Thread(manufacturer);
//        Thread th2 = new Thread(consumer);
//        th1.setName("Произ");
//        th2.setName("Потр");
//th1.start();
//th2.start();






    }
}
