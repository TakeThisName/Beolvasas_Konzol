import java.util.InputMismatchException;
import java.util.Scanner;

public class negyedik {

	public static void main(String[] args) {
		Scanner beolvas = new Scanner(System.in);
		int[] szamok = new int[5];
		
		try {
			System.out.println("Kérem az 5 számot legalacsonyabbtól a legmagasabbig!");
			
			for (int i = 0; i < szamok.length; i++) {
				szamok[i] = beolvas.nextInt();
			}
			if (szamok[0]+szamok[1] == szamok[2] && szamok[1] + szamok[2] == szamok[3])
				System.out.println("A számok illeszkednek a Fibonacci sorozatra");
			else
				System.out.println("A számok NEM illeszkednek a Fibonacci sorozatra");
		} catch (InputMismatchException e) {
			System.err.println(e);
		}

	}

}
