package scannerclass_buffer_demo;
import java.util.Scanner;
public class Scanner_class_demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println(name);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println(age);
		scan.close();

	}

}