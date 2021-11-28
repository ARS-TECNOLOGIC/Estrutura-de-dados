public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String novoNome, String novoCpf){
        this.nome = novoNome;
        this.cpf = novoCpf;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome+cpf;
    }



}
