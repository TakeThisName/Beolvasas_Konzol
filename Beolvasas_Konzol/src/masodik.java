import java.util.InputMismatchException;
import java.util.Scanner;


public class masodik {

	public static void main(String[] args) {
		Scanner beolvas = new Scanner(System.in);
		
		try {
			System.out.println("Kérem a számot!");
			int a = beolvas.nextInt();
			
			if (a % 2 == 0)
				System.out.println("A szám osztható kettővel");
			if (a % 3 == 0)
				System.out.println("A szám osztható hárommal");
			else
				System.out.println("A szám nem osztható sem kettővel, sem hárommal");
			
		} catch (InputMismatchException e) {
			System.err.println(e);
		}
		

	}

}
