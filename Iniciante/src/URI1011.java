import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double volume = 4 * 3.14159 * (Math.pow(raio, 3)) / 3;

        System.out.printf("VOLUME = %.3f%n", volume);
        input.close();
    }
}
