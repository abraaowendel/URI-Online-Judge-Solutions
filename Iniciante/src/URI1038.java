import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int codigo, quant;
        double price = 0.0;

        codigo = input.nextInt();
        quant = input.nextInt();

        switch (codigo) {
            case 1:
                price = 4.00;
                break;
            case 2:
                price = 4.50;
                break;
            case 3:
                price = 5.00;
                break;
            case 4:
                price = 2.00;
                break;
            case 5:
                price = 1.50;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", (price * quant));
        input.close();
    }
}
