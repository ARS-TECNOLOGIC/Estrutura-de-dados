import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] VetorZao = new int[10]; // declarei o vetor
        Random random = new Random(); // chamei o random

        for (int i = 0; i < VetorZao.length; i++) {
            VetorZao[i] = random.nextInt(10); // vetor recebe valores randomicamente
            System.out.println(VetorZao[i]); // escreve os valores no console.
        }

    }
}
