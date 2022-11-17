import java.util.Scanner;

public class URI1004 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("PROD = " + (a*b));
        input.close();
    }
}
