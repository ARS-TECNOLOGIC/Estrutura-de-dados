public class Lista {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public Lista(){
        this.tamanho = 0;
    }
    public Elemento getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        Elemento novoElemto = new Elemento(novoValor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemto;
            this.ultimo = novoElemto;
            
        }else{
            this.ultimo.setProximo(novoElemto);
            this.ultimo = novoElemto;
        }
        this.tamanho++;
    }

    public void remover(String novoValor) {

    }
    public Elemento get(int posição){
        Elemento atual = this.primeiro;
        for(int i=0; i < posição; i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
