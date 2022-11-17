import java.util.Scanner;

public class URI1015 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distancia = Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow((y2 - y1), 2));
        System.out.println(String.format("%.4f", distancia));
        
        input.close();
    }
}
