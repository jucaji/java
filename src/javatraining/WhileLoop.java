package javatraining;

public class WhileLoop {
    public static void main(String[] args) {
       int count = 1;
        while (count < 10){
            count++;
            if (count == 6)
                break; //rompe el flujo de ejecucion
                //continue;//salta el valor 6 y continua la ejecucion
            System.out.println(count+" Hola mundo");
        }
        System.out.println("Fin del programa");
    }
}
