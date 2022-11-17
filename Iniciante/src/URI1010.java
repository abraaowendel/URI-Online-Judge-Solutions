import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int pc1 = input.nextInt();
        int quant1 = input.nextInt();
        double value1 = input.nextDouble();

        int pc2 = input.nextInt();
        int quant2 = input.nextInt();
        double value2 = input.nextDouble();

        System.out.printf("VALOR A PAGAR: R$%.2f%n", ((quant1 * value1) + (quant2 * value2)));
        
        input.close();
    }
}
