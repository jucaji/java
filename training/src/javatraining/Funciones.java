package javatraining;

public class Funciones {
    public static void main(String[] args) {

        //funciones
        holaMundo();
        holaMundo();
        holaMundo2("Julian");
        String hola= devolverHolaMundo();
        System.out.println(hola);
    }
    /**
     * Imprime hola mundo
     * void -> no retorna nada, es el tipo de retorno del método
     */
    public static void holaMundo() {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }

    private static void holaMundo2(String name) {
        System.out.println("Hello world! " + name);
    }
    //Sobre carga de funciones
    /**
     * Al tener diferente tipo de parámetros el nombre del metodo se puede utilizar en diferentes métodos
     * A esto se llama sobre carga de funciones
     */
    private static void holaMundo2(String name, String surname) {
        System.out.println("Hello world! " + name + surname);
    }
    private static void holaMundo2(Integer name, String surname) {
        System.out.println("Hello world! " + name + surname);
    }
    private static void holaMundo2(String name, Integer surname) {
        System.out.println("Hello world! " + name + surname);
    }
    private static String devolverHolaMundo() {
        return "Hello world!";
    }
}
