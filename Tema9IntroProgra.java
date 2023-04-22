package org.openbootcamp;

public class Tema9IntroProgra {

    public static void main(String[] args) {

        Client cliente = new Client();
        cliente.age = 25;
        cliente.name = "Martin";
        cliente.number = "0234567";
        cliente.credit = 1500;

        System.out.println(cliente.age);
        System.out.println(cliente.name);
        System.out.println(cliente.number);
        System.out.println(cliente.credit);

        Worker trabajador = new Worker();
        trabajador.age = 31;
        trabajador.name = "Alejandro";
        trabajador.number = "09123456";
        trabajador.salario = 1300;

        System.out.println(trabajador.age);
        System.out.println(trabajador.name);
        System.out.println(trabajador.number);
        System.out.println(trabajador.salario);
    }
}

class Person {
    int age = 0;
    String name = "";
    String number = "";
}

class Client extends Person {
    double credit = 0;
}

class Worker extends Person {
    double salario = 0;
}