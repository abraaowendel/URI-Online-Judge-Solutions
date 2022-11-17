import java.util.Scanner;

public class URI1045 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double aux;

        if (b > a && b > c) {
			aux = a;
			a = b;
			b = aux;
		} else if (c > a) {
			aux = a;
			a = c;
			c = aux;
		}

        if(a >= b + c ){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            if(Math.pow(a, 2) == Math.pow(a, 2) + Math.pow(a, 2)){
                System.out.println("TRIANGULO RETANGULO");
            } 
            if(Math.pow(a, 2) > Math.pow(a, 2) + Math.pow(a, 2)){
                System.out.println("TRIANGULO OBTUSANGULO");
            } 
            if(Math.pow(a, 2) < Math.pow(a, 2) + Math.pow(a, 2)){
                System.out.println("TRIANGULO ACUTANGULO");
            } 
            if(a == b && a == c && b == c){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if((a == b && a != c) || (a == c && a != b) || (b == c && B != a)){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        
        input.close();
    }
}
