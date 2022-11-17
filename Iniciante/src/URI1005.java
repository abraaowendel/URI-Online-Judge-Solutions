import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Double a = input.nextDouble();
        Double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.printf("MEDIA = %.1f%n", (((2 * a) + (3 * b) + (5 * c)) / 10));
        input.close();
    }
}
