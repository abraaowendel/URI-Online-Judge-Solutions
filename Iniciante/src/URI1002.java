import java.util.Scanner;

/*  A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π. 
 */

public class URI1002 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();

        double area = (raio * raio) * 3.14159;
        System.out.printf("A=%.4f%n", area);
        input.close(); 
    }
}
