import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        int y;
        do {
            System.out.print("Digite o valor de Y (Y>=0): ");
            y = scanner.nextInt();
        } while (y < 0);

        System.out.println("O resultado de " + x + "^" + y + " é: " + calcPot(x, y));

    }

    public static long calcPot(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * calcPot(x,y-1);
    }
}