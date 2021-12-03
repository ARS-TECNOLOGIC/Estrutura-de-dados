
public class testaListaLigada {

	public static void main(String[] args) {
		Lista minhaLista = new Lista();
		//agenda.inserir(new Contato("fabio",45,"1234566"));
		minhaLista.insereInicio(new Cliente(10,"Marcos","",0));
		minhaLista.insereInicio(new Cliente(20,"Pedro","",0));
		minhaLista.insereInicio(new Cliente(30,"Fabio","",0));
		minhaLista.inserePosicao(new Cliente(5,"Samuel","",0),0);
		
		minhaLista.imprimeLista();
		
	}
}
