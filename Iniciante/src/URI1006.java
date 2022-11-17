import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Double a = input.nextDouble();
        Double b = input.nextDouble();
        System.out.printf("MEDIA = %.5f%n", (((2 * a) + (3 * b)) / 11));
        input.close();
    }
}
