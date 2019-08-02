package com.company;

public class Main {

    public static void main(String[] args) {

        Склад склад = new Склад(0);
        Производитель производитель = new Производитель();
        Потребитель потребитель = new Потребитель();

        Thread th1 = new Thread(производитель);
        Thread th2 = new Thread(потребитель);
        th1.setName("Произ");
        th2.setName("Потр");



            th1.start();


            th2.start();

    }
}
