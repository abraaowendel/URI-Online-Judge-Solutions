import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int ht = input.nextInt();
        double vph = input.nextDouble();

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", (ht * vph));

        input.close();

    }
}
