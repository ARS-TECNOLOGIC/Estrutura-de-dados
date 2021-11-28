public class ProgramaClientes {
    public static void main(String[] args) {
        Lista<Cliente> clientes = new Lista<Cliente>();
        clientes.adicionar(new Cliente("Anselmo", "123456"));
        clientes.adicionar(new Cliente("Carlos", "1234455"));
        clientes.adicionar(new Cliente("Fabio", "223344"));

        for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.get(i).getValor());
        }
        // Esta faltando o metodo de excluir a lista de novos clientes

    }
}
