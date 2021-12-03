public class App {
    // Aplicação cliente
    public static void main(String[] args) throws Exception {
        // Contato c1 = new Contato("Carlos", 20, "111111116");
        Lista agenda = new Lista();

        agenda.inserir(new Contato("Fabio", 15, "111111114"));
        agenda.inserir(new Contato("Daniel", 18, "111111113"));
        agenda.inserir(new Contato("Junior", 30, "111111112"));
        agenda.inserir(new Contato("Anselmo", 35, "111111111"));
        agenda.inserir(new Contato("Anselmo Roberto", 35, "111111111"));

        agenda.listarContatos();

        agenda.atualizarContato("Fabi", 22, "997840862");
        agenda.listarContatos();
        System.out.println(agenda.quantidade());
        // System.out.println(agenda.recuperaContato("Anselmo"));

    }
}
