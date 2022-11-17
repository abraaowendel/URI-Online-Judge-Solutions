import java.util.Scanner;

public class URI1016 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();
        int minutos = (distancia * 60) / 30;
        System.out.println(minutos + " minutos"); 

        input.close();
    }
}
