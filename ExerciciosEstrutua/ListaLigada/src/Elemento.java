public class Elemento {
   private String valor;
    private Elemento proximo;

    public Elemento(String novo){
       this.valor = novo; 
       this.proximo = null;
    }

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Elemento getProximo() {
        return proximo;
    }
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

}
