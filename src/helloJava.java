import java.util.Scanner;
public class helloJava {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String name = scan.nextLine();
		System.out.println("hello, " + name);
	}
}
