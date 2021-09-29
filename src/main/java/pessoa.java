public class pessoa {



        private   int codigo;
        private String nome;

        public pessoa(int codigo, String nome){
            this.codigo=codigo;
            this.nome=nome;
        }

    public int getCodigo() { // encapsulamento
        return codigo;
    }

        public void setCodigo(int codigo) { // encapsulamento
            this.codigo=codigo;
        }

    public String getNome() { // encapsulamento
        return nome;
    }



}
