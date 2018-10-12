import java.util.InputMismatchException;
import java.util.Scanner;

public class ötödik {

	public static void main(String[] args) {
		Scanner beolvas = new Scanner(System.in);
		int[] szamok = new int[5];
		
		try {
			System.out.println("Kérem az 5 számot legalacsonyabbtól a legmagasabbig!");
			
			for (int i = 0; i < szamok.length; i++) {
				szamok[i] = beolvas.nextInt();
			}
			
		} catch (InputMismatchException e) {
			System.err.println(e);
		}

	}

}