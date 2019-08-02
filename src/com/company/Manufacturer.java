package com.company;

public class Manufacturer extends Thread {


    Stock stock = new Stock(0);

    public Manufacturer(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {

        System.out.println("Запуск потока - " + this.getClass().getName());
        increaseCounter();
        System.out.println("Производство продукии");
        System.out.println("Количество товара на складе: " + stock.getCounter());
        System.out.println("------------------------------");
    }

    public void increaseCounter() {
        stock.setCounter(stock.getCounter() + 1);
    }


}
