public class Lista {
    private Contato elementos[];
    private int qtd;

    public Lista() {
        elementos = new Contato[100];
        this.qtd = 0;
    }

    public void inserir(Contato c) {

        this.elementos[this.qtd] = c;
        this.qtd++;
    }

    

    public void listarContatos() {
        for (int i = 0; i < qtd; i++) {
            System.out.println(elementos[i] + "\n");
        }

    }

    public void atualizarContato(String nome, int idade, String telefone) {
        for (int i = 0; i < qtd; i++) {
            if (this.elementos[i].comparaNome(nome) == 0) {
                elementos[i] = new Contato(nome, idade, telefone);
                System.out.println("Atualização realizado com sucesso!! Na posição: "+qtd+"\n");
                return;
            }
        }
        System.out.println("Atualização não realizada!! \n");
    }

    public Contato recuperaContato(String nome) {
        for (int i = 0; i < qtd; i++) {
            if (this.elementos[i].comparaNome(nome) == 0)
                return this.elementos[i];
        }
        return null;

    }

    public int quantidade() {
        return this.qtd;
    }
}
