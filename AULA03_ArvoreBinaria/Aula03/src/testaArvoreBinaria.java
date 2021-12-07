
// para visualizar estrutura de dados
// use o site https://visualgo.net/pt/bst
public class testaArvoreBinaria {

	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		arvore.insere(50);
		arvore.insere(30);
		arvore.insere(80);
		arvore.insere(40);
		arvore.insere(20);
		arvore.insere(70);
		arvore.insere(90);
		System.out.println("Imprime a arvore em ordem crescente");
		arvore.simFixado();
		System.out.println("\n\nDesenha a arvore deitada");
		arvore.DesenhaDeitado();
		

	}

}
