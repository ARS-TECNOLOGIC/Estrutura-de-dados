public class Contato {
    private String nome;
    private int idade;
    private String telefone;

    public Contato(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public int comparaNome(String nome) {
        return this.nome.compareTo(nome);
    }

    public String getTelefone() {
        return this.telefone;
    }
    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString() {
        return "Contato [idade=" + idade + ", nome=" + nome + ", telefone=" + telefone + "]";
    }
    
}
