import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int idadeDias = input.nextInt();

        int anos = idadeDias / 365;
        int meses = idadeDias % 365 / 30;
        int dias = idadeDias % 365 % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        input.close();
    }
}
