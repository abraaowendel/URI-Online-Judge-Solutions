import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int horas = input.nextInt();
        int velocidaMedia = input.nextInt();

        int distanciaPercorrida = velocidaMedia * horas;
        System.out.printf("%.3f%n", (double) distanciaPercorrida / 12);
        input.close(); 
    }
}
