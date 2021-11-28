public class App {
    public static void main(String[] args) throws Exception {

        Lista lista = new Lista();

        lista.adicionar("AC");
        lista.adicionar("RN");
        lista.adicionar("SP");
        lista.adicionar("SC");
        lista.adicionar("MT");
        

        lista.remover("ac");
        lista.remover("rn");
        lista.remover("SP");
        lista.remover("SC");
        lista.remover("MT");
   

        for(int i = 0; i< lista.getTamanho();i++){
            System.out.println(lista.get(i).getValor());
        }
        System.out.println(lista.getTamanho());
    }
}
