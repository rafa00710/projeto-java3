public class pessoaApp {

    public static void main(String[] args){

        pessoa pessoa1 = new pessoa(1,"Rafa");
        pessoa pessoa2 = new pessoa(2,"Ruan Rafael");

        System.out.println("o nome do objeto pessoal eh: " +pessoa2.getNome());
        // conceito de Encapsulamento

       //pessoa2.setNome("Ruan Rafael");// setNome - altera o nome do atributo
        //System.out.println("o nome do objeto pessoal eh: " +pessoa2.getNome());
    }
}
