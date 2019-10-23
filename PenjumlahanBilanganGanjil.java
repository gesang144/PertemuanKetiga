import java.util.Scanner;

public class PenjumalahanBilangan {
    public static void main(String[] args){

        Scanner userInput=new Scanner(System.in);
        System.out.println("Masukan jumlah bilangan= ");

        int jumlahBilangan = userInput.nextInt();
        int angka = 0;
        int total = 0;
        int i = 0;

        while (angka < jumlahBilangan){
            System.out.println("masukan angka");
            angka = userInput.nextInt();
            total= total + angka;
            i++;
            System.out.println( "hasil kalkulasinya adalah" + total);
        }
    }
}
