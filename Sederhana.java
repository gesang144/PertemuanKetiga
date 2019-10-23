import java.util.*;

public class Sederhana
{
	
	private static int divisorCount = 0;
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.print("Masukkan angka: ");
		long angka = userInput.nextLong();
		
		setLamp(angka);
	}
	
	private static void setLamp(long lampTotal){
		for(int i = 1; i <= lampTotal; i++)
			if(lampTotal % i == 0) divisorCount++;
		
		
		if(divisorCount % 2 == 0) System.out.println("Lampu keadaan mati");
		else System.out.println("Lampu keadaan menyala");
	}
}
