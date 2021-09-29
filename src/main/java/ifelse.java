public class ifelse {

    public static void main(String[] args) {

        int idade = 34;

        if (idade <= 10) { // if executa sempre o verdadeiro

            System.out.println("Criança");
        } else if (idade <= 17) { // else executa sempre o falso
            System.out.println("Adolescente");
        } else { // else executa sempre o falso
            System.out.println("Adulto");


        }

    }

}
