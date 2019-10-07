import java.util.Scanner;

public class PenjumlahanBilangan {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = userInput.nextInt();
        int angka = 0;
        int i = 0;
        int total = 0;

        while (i < jumlahBilangan) {
            System.out.print("Masukkan angka: ");
            angka = userInput.nextInt();
            total = total + angka;
            i++;
        }

        System.out.println("Hasil kalkulasinya adalah " + total);
    }
}
