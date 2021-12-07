
// Implementa��o da classe �rvore bin�ria, com construtor e o m�todo insere()
public class ArvoreBinaria {
	private No raiz;

	public ArvoreBinaria() // construtor da classe Arvore Binaria
	{
		this.raiz = null; // inicia a �rvore vazia
	}

	public void insere(long id) // m�todo faz inser��o de elemento
	{
		this.raiz = insere(id, this.raiz);
	}
	// m�todo faz inser��o de elemento
	public No insere(long id, No aux) {

		if( aux == null ) { // nao achou 
			return new No(id, null, null);
		}
		// faz a busca antes de inserir
		if (id < aux.getId())
			aux.setEsq(insere(id, aux.getEsq()));
		else if (id > aux.getId())
			aux.setDir(insere(id, aux.getDir()));
		//igual nao faz nada se for igual return true pois achou
	    return aux;
	}
	public void remove(long id) // m�todo faz inser��o de elemento
	{
		this.raiz = remove(id, this.raiz);
	}
	// m�todo faz inser��o de elemento
	public No remove(long id, No aux) {

		if( aux != null ) { // soh come�a se for diferente de null
			// faz a busca antes de remover
			if (id < aux.getId())
				aux.setEsq(remove(id, aux.getEsq()));
			else if (id > aux.getId())
				aux.setDir(remove(id, aux.getDir()));
			else // achou
				return null;
		}
	    return aux;
	}
	// percurso sim�trico ou InOrdem
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
	public boolean busca(long id, No aux) {
		if( aux == null ) // nao achou 
			return false;
		
		if (id < aux.getId())
			return busca(id, aux.getEsq());
		else if (id > aux.getId())
			return busca(id, aux.getDir());
		else // igual
			return true; // se for igual return true pois achou 
				
	}
	public boolean busca(long id) {
		return busca(id, this.raiz); // efetua a busca a partir da raiz da arvore
	}
}