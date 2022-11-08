import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
                System.out.print("身長:");
                double height = scan.nextDouble();
                System.out.print("体重:");
                double weight = scan.nextDouble();
		double height2 = height / 100.0;
                double BMI = weight / Math.pow(height2,2);
                System.out.println((double)Math.round(BMI * 100)/100);
                scan.close();
	}
}
