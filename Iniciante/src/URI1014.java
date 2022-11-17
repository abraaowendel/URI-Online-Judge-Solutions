import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double km = input.nextDouble();

        System.out.printf("%.3f km/l%n", (x / km));
        input.close();   
    }
}
