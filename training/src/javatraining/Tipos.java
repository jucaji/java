package javatraining;

public class Tipos {

    public static void main(String[] args) {

        //enteros
        byte b = 127; //1 byte
        short s = 32767; //2 bytes
        int i = 2147483647; //4 bytes
        long l = 9223372036854775807L;//8 bytes

        //decimales
        float f = 3.4028235E38F; //4 bytes
        double d = 1.7976931348623157E308; //8 bytes

        //caracteres
        char c = 'a'; //2 bytes

        //booleanos
        boolean bo = true; //1 bit

        //cadenas
        String str = "Hola mundo";

        //imprimir
        System.out.println("byte: " + b);

    }
}
