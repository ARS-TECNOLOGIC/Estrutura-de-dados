public class TestaArvoreBinaria {
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.insere(50);
        arvore.insere(30);
        arvore.insere(80);
        arvore.insere(40);
        arvore.insere(20);
        arvore.insere(70);
        arvore.insere(90);

        arvore.simFixado(); // desenha em ordem crescente

        System.out.println("\n\n\n");
        arvore.desenhaDeitado(); // desenha a arvore de deitada.

    }
}
