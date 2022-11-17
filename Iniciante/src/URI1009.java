import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        double sal = input.nextDouble();
        double vendas = input.nextDouble();
        System.out.printf("TOTAL = R$ %.2f%n", (sal + (vendas * 0.15)));
        input.close();
    }
}
