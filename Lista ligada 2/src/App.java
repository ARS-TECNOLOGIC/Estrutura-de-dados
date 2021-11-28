public class App {
    public static void main(String[] args) throws Exception {

        Lista<Integer> lista= new Lista<Integer>();

        lista.adicionar(9);
        lista.adicionar(8);
        lista.adicionar(7);
        lista.adicionar(6);
        lista.adicionar(5);
        

       // lista.remover(5);
        lista.remover(6);
        lista.remover(7);
        lista.remover(8);
     //   lista.remover(9);
   
        for(int i = 0; i< lista.getTamanho();i++){
            System.out.println(lista.get(i).getValor());
        }
        System.out.println(lista.getTamanho());
    }
}
