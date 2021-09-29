import java.util.function.Function;

public class FuncaoRetornaNomeAoContrario {
    public  static void main(String[] args){

        Function<String,String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();

        System.out.println(retornarNomeAoContrario.apply("Rafael"));

        Function<String,Integer> converterStringParaInteiroCalculaODobro = String -> Integer.valueOf(String) * 2;
        System.out.println(converterStringParaInteiroCalculaODobro.apply("20"));
    }
}
