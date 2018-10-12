import java.util.InputMismatchException;
import java.util.Scanner;

public class elso {
	
	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		int a = 0;
		int c = 0;
		
		try {
			while (a != 11) {
				System.out.println("Adjon meg egy számot: ");
				a = beolvas.nextInt();
				c++;
			}
			System.out.println("A 11-es a "+c+"-dik szám volt");
		} catch (InputMismatchException e) {
			System.err.println("Számot kérek!");
		}

	}

}
