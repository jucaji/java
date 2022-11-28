package javatraining;

public class IfElse {
    public static void main(String[] args) {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        boolean check = 5 < 10;
        int number1 = 50;
        int number2 = 10;
        int number3 = 15;
        if (number1 < number2 && number2 < number3) {
            System.out.println("verdadero");
        }
        System.out.println("fin del programa");
    }
}
