public class ListaLigada {
    private Elemento inicio;
    private Elemento fim;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
        this.inicio = null;
        this.fim = null;
    }

    public Elemento getInicio() {
        return inicio;
    }

    public void setInicio(Elemento inicio) {
        this.inicio = inicio;
    }

    public Elemento getFim() {
        return fim;
    }

    public void setFim(Elemento fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void inserir(String novo) {
        Elemento novoElmento = new Elemento(novo);
        tamanho++;

        if (inicio == null && fim == null) {
            inicio = novoElmento;
            fim = inicio;

        } else {
            fim.setProximo(novoElmento);
            fim = novoElmento;
        }
    }

    public void inserirPos(String novo, int pos) {
        Elemento novoElemento = new Elemento(novo);
        Elemento atual = buscaElemento(pos);

        if (atual != null) {
            novoElemento.setProximo(atual.getProximo());
            atual.setProximo(novoElemento);
            tamanho++;
        }
    }

    public void removeElemento(int pos) {
        Elemento removerAtual = buscaElemento(pos);
        if (tamanho == 1) {
            removerAtual = null;
            tamanho = 0;
        } else {
            Elemento anterior = buscaElementoAnt(pos);
            anterior.setProximo(removerAtual.getProximo());
            removerAtual = null;
            tamanho--;
        }
    }

    public Elemento buscaElemento(int pos) {
        Elemento atual = inicio;
        for (int i = 0; i < pos - 1; i++) {
            atual = atual.getProximo();
        }
        System.out.println("O elemento na posição é: " + atual.getValor());
        return atual;
    }

    public Elemento buscaElementoAnt(int pos) {
        Elemento aux = inicio;
        Elemento ant = null;
        for (int i = 0; i < pos - 1; i++) {
            ant = aux;
            aux = aux.getProximo();
        }
        System.out.println("O elemento anterior: " + ant.getValor());
        return ant;
    }

    public void listar() {
        if (tamanho == 0) {
            System.out.print("A lista não tem elemento!!");
        } else {
            Elemento aux1 = inicio;
            for (int i = 0; i < tamanho; i++) {
                System.out.print(aux1.getValor() + "-");
                aux1 = aux1.getProximo();
            }
        }
    }
}
