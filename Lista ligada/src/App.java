public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Lista lista1 = new Lista();
        lista1.adicionar("AC");
        lista1.adicionar("SP");
        lista1.adicionar("RN");
        lista1.adicionar("SC");
        lista1.adicionar("MS");
        lista1.adicionar("MG");
        //System.out.println(lista1.getPrimeiro().getValor());
        //System.out.println(lista1.getUltimo().getValor());
        //System.out.println(lista1.getUltimo().getValor());

        System.out.println(lista1.get(0).getValor());
        System.out.println(lista1.get(1).getValor());
        System.out.println(lista1.get(2).getValor());


    }
}
