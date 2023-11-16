// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = s.nextInt();

        if (num < 0) {
            System.out.println("nonnegative plz");
            main(args);
        } else {
            System.out.println("Next >> ");
        }

        int[] N = new int[num];
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i < num; i++) {
            System.out.println("Number " + (i+1) + ": ");
            N[i] = s.nextInt();
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
        }
        sort(N);
        System.out.println("sort Number : ");
        for (int n : N) {
            System.out.print(n + " ");
        }
    }
    public static void sort(int[] N){
        int l = N.length;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < l-1; i++) {
                if(N[i] > N[i + 1]){
                    int keep = N[i+1];
                    N[i+1] = N[i];
                    N[i] = keep;
                    swap = true;
                }
            }
        }
    }
}