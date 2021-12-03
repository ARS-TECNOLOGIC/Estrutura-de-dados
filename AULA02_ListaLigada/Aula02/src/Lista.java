// Implementa��o da classe Lista
public class Lista {
	private No inicio;

	public Lista() // construtor da classe Lista inicializada vazia
	{
		this.inicio = null;
	}

	// Inser��o de um elemento no in�cio da Lista.
	public void insereInicio(Object elemento) {
		No novo = new No(elemento, null);
		novo.setProximo(this.inicio);
		this.inicio = novo;
	}

	public void inserePosicao(Object elemento, int pos) {

		int i = 0;
		No aux = this.inicio;
		No ant = null;
		while (i < pos) {
			ant=aux;
			aux = aux.getProximo();
			i++;
		}
		No novo = new No(elemento,aux);
		if(ant == null){
		this.inicio = novo;
		}else{
			ant.setProximo(novo);
		}	
	}
	public void imprimeLista() {
		No aux = this.inicio;
		while (aux != null) {
			System.out.println(aux.getElemento() + " ");
			aux = aux.getProximo();
		}
	}
}
