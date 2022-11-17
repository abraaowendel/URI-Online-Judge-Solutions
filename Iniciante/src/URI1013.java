import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int MaiorAB = a;

        if(b > MaiorAB){
            MaiorAB = b;
        }
        else if(c > MaiorAB){
            MaiorAB = c;
        }

        System.out.printf("%d eh o maior%n", MaiorAB);
        input.close();
    }
}
