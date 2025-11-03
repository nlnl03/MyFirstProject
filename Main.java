
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter name");
		String name = s.nextLine();
		System.out.println("Name: " + name);
		s.close();
	}

}
