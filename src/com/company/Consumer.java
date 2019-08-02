package com.company;

public class Consumer extends Thread {

    Stock stock = new Stock(0);

    public Consumer(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {

        System.out.println("Запуск потока - " + this.getClass().getName());
        decreaseCounter();
        System.out.println("Потребление продукии");
        System.out.println("Количество товара на складе: " + stock.getCounter());
        System.out.println("------------------------------");


    }

    public void decreaseCounter() {
        stock.setCounter(stock.getCounter() - 1);
    }


}
