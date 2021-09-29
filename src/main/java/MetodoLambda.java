import java.util.function.Consumer;

public class MetodoLambda {

    public static void main(String[] args){

        // Method Reference
        // Apenas
        // Utilizar o parametro da forma que ele foi recebido

        //Consumer<String> imprimirUmaFrase = System.out::println;

        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }
}
