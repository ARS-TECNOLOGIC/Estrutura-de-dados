public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void insere(long id) {

        No aux = this.raiz;
        No pai = null;
        while (aux != null) {
            pai = aux;
            if (id < aux.getId()) {
                aux = aux.getEsq();
            } else if (id > aux.getId()) {
                aux = aux.getDir();
            } else {
                return; // não faz nada
            }

        }
        No novo = new No(id, null, null);
        if (pai == null) {
            this.raiz = novo;
        } else if (id < pai.getId()) {
            pai.setEsq(novo);
        } else if (id > pai.getId()) {
            pai.setDir(novo);
        }
    }

    public void simFixado() {
        simFixado(this.raiz);
    }

    private void simFixado(No atual) {
        if (atual != null) {
            simFixado(atual.getEsq());
            System.out.print(atual.getId() + " ");
            simFixado(atual.getDir());
        }
    }

    public void desenhaDeitado() {
        desenhaDeitado(this.raiz, " ");
    }

    private void desenhaDeitado(No atual, String espacos) {
        if (atual != null) {
            desenhaDeitado(atual.getDir(), espacos +"   ");
            System.out.println(espacos + atual.getId()+"   ");
            desenhaDeitado(atual.getEsq(), espacos+"   ");
        } else {
            System.out.println(espacos + "-");
        }
    }
}
