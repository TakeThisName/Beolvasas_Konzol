import java.util.InputMismatchException;
import java.util.Scanner;

public class harmadik {

	public static void main(String[] args) {
		Scanner beolvas = new Scanner(System.in);
		int[] szamok = new int[3];
		
		try {
			System.out.println("Kérem az első számot: ");
			szamok[0] = beolvas.nextInt();
			System.out.println("Kérem a második számot: ");
			szamok[1] = beolvas.nextInt();
			System.out.println("Kérem a harmadik számot: ");
			szamok[2] = beolvas.nextInt();
			
			if (szamok[0] > szamok[1] && szamok[0] > szamok[2])
				System.out.println("A legnagyobbn szám a/az: "+szamok[0]);
			if (szamok[1] > szamok[0] && szamok[1] > szamok[2])
				System.out.println("A legnagyobbn szám a/az: "+szamok[1]);
			if (szamok[2] > szamok[1] && szamok[2] > szamok[0])
				System.out.println("A legnagyobbn szám a/az: "+szamok[2]);
			
			if (szamok[0] % 3 == 0 && szamok[1] % 3 == 0 && szamok[2] % 3 == 0)
				System.out.println("Mindhárom szám osztható hárommal");
			
				
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
