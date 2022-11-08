import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 for(int i=0; i<2;i++){
                System.out.println("身長");
                double height = scan.nextDouble();
                System.out.println("体重");
                double weight = scan.nextDouble();
		double height2 = height / 100.0;
                double BMI = weight / Math.pow(height,2);
                System.out.println((double)Math.round(BMI * 100)/100);
	 }
                scan.close();
	}
}
