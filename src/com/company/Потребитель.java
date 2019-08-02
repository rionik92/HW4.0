package com.company;

public class Потребитель extends Thread {

    Склад склад = new Склад(0);


    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Запуск потока - " + this.getClass().getName());
            ПотреблениеПродукции();
            System.out.println(склад.getКоличествоТовараНаСкладе());

        }
    }

    public void ПотреблениеПродукции() {
        склад.setКоличествоТовараНаСкладе(склад.getКоличествоТовараНаСкладе()-1);
    }


}
