import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Power value :");
		int power = scanner.nextInt();
		double powerValue = Math.pow(2, power);
		System.out.println(powerValue);
		int counter = 1;
		while(Math.pow(2, counter) <= Math.pow(2,power))
		{
			System.out.println("2^" + counter + "=" + Math.pow(2, counter));
			counter++;
		}
	}
}