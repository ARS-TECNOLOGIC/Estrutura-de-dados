public class App {
    // Aplicação cliente
    public static void main(String[] args) throws Exception {
    
        Lista agenda = new Lista();

        agenda.inserir(new Contato("Daniel", 18, "111111113"));
        agenda.inserir(new Contato("Junior", 30, "111111112"));
        agenda.inserir(new Contato("Anselmo", 35, "111111111"));
        agenda.inserir(new Contato("Roberto", 35, "111111111"));
        agenda.inserir(new Contato("Fabio", 15, "111111114"),3); // inserindo na posição informada pelo indice.


        agenda.listarContatos();
        System.out.println("\n\n");

        agenda.inserir(new Contato("Ana", 15, "111111114"),2);
        
        // agenda.atualizarContato("Fabi", 22, "997840862");
        agenda.listarContatos();

        System.out.println(agenda.quantidade());
        // System.out.println(agenda.recuperaContato("Anselmo"));

    }
}
