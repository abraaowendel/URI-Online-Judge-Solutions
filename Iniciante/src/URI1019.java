import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int tempoTotal = input.nextInt();

        int horas = tempoTotal / 3600;
        int minutos = tempoTotal % 3600 / 60;
        int segundos = tempoTotal % 3600 % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
        input.close();
    }
 
}
