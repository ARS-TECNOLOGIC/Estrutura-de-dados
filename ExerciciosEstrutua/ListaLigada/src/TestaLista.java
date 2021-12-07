public class TestaLista {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.inserir("AC");
        lista.inserir("RN");
        lista.inserir("SP");
        lista.inserir("RJ");
        lista.inserir("MT");
        lista.inserir("MG");
        // System.out.println("Ultimo Atual: \n");
        // System.out.println(lista.getFim().getValor());

        // System.out.println(lista.getInicio().getValor());
        // System.out.println(lista.getFim().getValor());

        // lista.listar();

        lista.inserirPos("SC", 1);
        // lista.inserirPos("AM", 5);
        // System.out.println("Ultimo Atual: \n");
        // System.out.println(lista.getFim().getValor());
        System.out.println("\n");
        lista.listar();
        
        System.out.println(lista.getTamanho());

        lista.removeElemento(2);
        System.out.print("\n");
        lista.listar();
        System.out.println(lista.getTamanho());
        
        lista.removeElemento(2);
        System.out.print("\n");
        lista.listar();
        System.out.println(lista.getTamanho());

        lista.removeElemento(2);
        System.out.print("\n");
        lista.listar();
        System.out.println(lista.getTamanho());

        lista.removeElemento(2);
        System.out.print("\n");
        lista.listar();
        System.out.println(lista.getTamanho());
        lista.removeElemento(2);
        System.out.print("\n");
        lista.listar();
        System.out.println(lista.getTamanho());
        lista.removeElemento(2);
        System.out.print("\n");
        lista.listar();
        System.out.println(lista.getTamanho());
        lista.removeElemento(1);
        lista.listar();
      
    }
}
