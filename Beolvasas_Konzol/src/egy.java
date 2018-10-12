import java.util.InputMismatchException;
import java.util.Scanner; // ez itt kell a konzolról olvasáshoz

public class egy {

	public static void main(String[] args) {
		Scanner beolvas = new Scanner(System.in); // példányosdítani kell a beolvasáshoz a Scanner osztályt
		
try {
	System.out.println("Kérek egy számot: ");
	int szam = beolvas.nextInt();
	double eredmeny = (double) 1/szam;
	System.out.println("A szám reciproka: "+eredmeny);
} catch (InputMismatchException e) { // típus hiba
	System.out.println("Hibás szám formátum \n Számot kérek");
}
beolvas.close();
	}

}
