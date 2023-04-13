package org.openbootcamp;

public class Tema4IntroProgra {

    public static void main(String[] args) {

        int numeroIf = -15;

        if (numeroIf > 0) {
            System.out.println("Es un numero positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es un numero negativo");
        } else {
            System.out.println("El numero es 0");
        }

        int numeroWhile = 1;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numDoWhile;
        do {
            numDoWhile = 1;
            System.out.println(numDoWhile);
        } while (numDoWhile < 0);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "verano";
        switch (estacion) {
            case "verano" :
                System.out.println("Es verano");
                break;
            case "invierno" :
                System.out.println("Es invierno");
                break;
            case "otoño" :
                System.out.println("Es otoño");
                break;
            case "primavera" :
                System.out.println("Es primavera");
                break;
            default:
                System.out.println(estacion + "no es una estacion");
                break;

        }

    }
}
