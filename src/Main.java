import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Figuras troca = new Figuras();
        Scanner prompt = new Scanner(System.in);
        int count;
        count = prompt.nextInt();

        for (int i = 0; i < count; i ++) {
            System.out.println("Digite a");
            troca.a = prompt.nextInt();
            System.out.println("Digite b");
            troca.b = prompt.nextInt();

            troca.trocarFigura(troca.a, troca.b);

            int resp = troca.trocarFigura(troca.a, troca.b);

            System.out.println(resp);
        }


    }
}
