public class Contacorrente {

    private int numero, agencia;
    private float limite;

    public Contacorrente(int numero, int agencia){ //criando metodos
        this.numero=numero;
        this.agencia=agencia;
    }

    public Contacorrente(int numero, int agencia, float limite){
        this.numero=numero;
        this.agencia=agencia;
        this.limite=limite;
    }
}
