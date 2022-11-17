import java.util.Arrays;
import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int[] vectA = new int[3];

        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = input.nextInt();
        }

        int[] vectB = vectA.clone();
        Arrays.sort(vectB);

        for (int i : vectB) {
            System.out.println(i);
        }
        System.out.println("");

        for (int i : vectA) {
            System.out.println(i);
        }
        input.close();
    }
}
