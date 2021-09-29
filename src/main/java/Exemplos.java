package domain;

//String - Textos
//byte - Números Inteiros ( -128 até 127
//int -  Números Interiros ( -2147483648 até 2147483647
//long - Números ( -9223372036854475808 até 9223372036854775807
//float -Números Decimais ( 1.1234567 até 7 casas decimais
//double - Números Decimais ( 1.123456789 até 15 casas decimais
//boolean - valores booleanos - true ou false

class Exemplo {

    public static void main(String[] args) {
        System.out.println("hello world");

        //Tipo de variável - nome da variável - valor da variável

        String nome = "Rafael";
        System.out.println(nome);

        byte numero = 127;
                System.out.println(numero);
        final int numero2 = 135; // valor não pode ser alterado com o final

        System.out.println(numero2);

        long numero3 = 123456789;
        System.out.println(numero3);

        float preco = (float) 1.2333333389;
        System.out.println(preco);

        double preco2 = 1.23456556898989898997f;
        System.out.println(preco2);

        boolean verdadeiro = true;
        System.out.println(verdadeiro);

        boolean falso = false;
        System.out.println(falso);
    }

}
