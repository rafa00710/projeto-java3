import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args){

        Supplier<pessoa1> instanciaPessoa = () -> new pessoa1();
        System.out.println(instanciaPessoa.get());
    }

}
class pessoa1 {
    private String nome;
    private Integer idade;

    public pessoa1() {
        nome = "Rafa";
        idade = 35;
    }

    @Override
    public String toString() {
        return String.format("nome : %s, idade: %d",nome,idade);
    }
}