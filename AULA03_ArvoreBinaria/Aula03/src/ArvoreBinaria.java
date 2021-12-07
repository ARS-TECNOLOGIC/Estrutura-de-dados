
// Implementação da classe árvore binária, com construtor e o método insere()
public class ArvoreBinaria {
	private No raiz;

	public ArvoreBinaria() // construtor da classe Arvore Binaria
	{
		this.raiz = null; // inicia a árvore vazia
	}

	public void insere(long id) // método para inserção de elemento
	{
		No aux = this.raiz;
		No pai = null;
		while (aux != null) {
			pai = aux; // guarda o pai antes de ir para esquerda ou direita
			if (id < aux.getId())
				aux = aux.getEsq();
			else if (id > aux.getId())
				aux = aux.getDir();
			else
				return; // se for igual nao faz nada
		}
		No novo = new No(id, null, null);
		if (pai == null) { // se pai eh nulo nao andei na arvore pois a raiz nula
			this.raiz = novo;
		}
		else if (id < pai.getId()) // testa se sera inserido a esquerda
			pai.setEsq(novo);
		else if (id > pai.getId())// ou a direinta
			pai.setDir(novo);
	}
	// percurso simétrico ou InOrdem
	public void simFixado() {
		simFixado(this.raiz);
	}
	private void simFixado(No atual){
		if( atual != null ) {
			simFixado(atual.getEsq());
			System.out.print(atual.getId()+" ");
			simFixado(atual.getDir());
		}
	}
	public void DesenhaDeitado() {
		DesenhaDeitado(this.raiz, "");
	}
	private void DesenhaDeitado(No atual, String espacos){
		if( atual != null ) {
			DesenhaDeitado(atual.getDir(), espacos+"    ");
			System.out.println(espacos+atual.getId());
			DesenhaDeitado(atual.getEsq(), espacos+"    ");
		}
		else
			System.out.println(espacos+"-");
			
	}
}