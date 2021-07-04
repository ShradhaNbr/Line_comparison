import java.util.Scanner;
public class line_comparison {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x1, x2, y1,y2;
		double len;
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter the first point");
		x1=sc.nextInt();
		System.out.println("Enter the second point");
                x2=sc.nextInt();
		System.out.println("Enter the third point");
                y1=sc.nextInt();
		System.out.println("Enter the fourth number");
                y2=sc.nextInt();
		sc.close();
		len = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		System.out.println(len);
	}
}
