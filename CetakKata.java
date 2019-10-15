import java.util.Scanner;

public class CetakKata {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kata;

        do {
            System.out.print("Masukkan kata: ");
            kata = userInput.nextLine();
            System.out.println(kata);
        } while (!kata.equalsIgnoreCase("Stop"));
    }
}
