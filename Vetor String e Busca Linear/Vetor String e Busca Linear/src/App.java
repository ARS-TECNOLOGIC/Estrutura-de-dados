
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] vetorZao = new String[10];

        vetorZao[0] = "AC";
        vetorZao[1] = "BA";
        vetorZao[2] = "CE";
        vetorZao[3] = "DF";
        vetorZao[4] = "AM";
        vetorZao[5] = "AP";
        vetorZao[6] = "PB";
        vetorZao[7] = "RN";
        vetorZao[8] = "MS";
        vetorZao[9] = "SP";

        for (int i = 0; i < vetorZao.length; i++) {

            System.out.println("Posição " + i + "-" + vetorZao[i]);
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual estado você esta buscando? ");
        String estadoBuscar = leitor.nextLine();
        System.out.println("Você buscando o estado: " + estadoBuscar);

        boolean achou = false;
        for (int i = 0; i < vetorZao.length; i++) {
            if (estadoBuscar.equalsIgnoreCase(vetorZao[i])) {
                achou = true;
                break;
            }

        }
        if (achou != true) {
            System.out.println("Elemento não localizado!"); // Elemento não localizado no vetor
        } else {
            System.out.println("Estado localizado no vetor!");
        }

    }
}
