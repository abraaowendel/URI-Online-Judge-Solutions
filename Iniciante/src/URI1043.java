import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        if(a + b > c && a + c > b && b + c > a){
            double p = a + b + c;
            System.out.printf("Perimetro = %.1f%n", p);
        }
        else{
            double ar = (a + b) * c / 2;
            System.out.printf("Area = %.1f%n", ar);
        }

        input.close(); 
    }
}
