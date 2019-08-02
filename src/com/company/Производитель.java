package com.company;

public class Производитель extends Thread {

    Склад склад = new Склад(0);

    @Override
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Запуск потока - " + this.getClass().getName());
            ПроизводствоПродукции();
            System.out.println(склад.getКоличествоТовараНаСкладе());

        }
    }

    public void ПроизводствоПродукции() {
        склад.setКоличествоТовараНаСкладе(склад.getКоличествоТовараНаСкладе()+1);
    }


}
