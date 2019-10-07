import java.util.Scanner;

public class BilanganGenap {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan maksimal bilangan: ");
        int maksimalBilangan = userInput.nextInt();

        for (int i = 1; i <= maksimalBilangan; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
