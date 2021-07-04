import java.util.Scanner;
public class line_comparison {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x1, x2,x3,x4,y1,y2,y3,y4;
		double len1, len2,line_equal;
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter the first point of line1");
		x1=sc.nextInt();
		System.out.println("Enter the second point of line1");
                x2=sc.nextInt();
		System.out.println("Enter the third point of line1");
                y1=sc.nextInt();
		System.out.println("Enter the fourth number of line1");
                y2=sc.nextInt();
		System.out.println("Enter the first point of line2");
                x3=sc.nextInt();
                System.out.println("Enter the second point of line2");
                x4=sc.nextInt();
                System.out.println("Enter the third point of line2");
                y3=sc.nextInt();
                System.out.println("Enter the fourth point of line2");
                y4=sc.nextInt();
                sc.close();
		len1 = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		len2 = Math.sqrt(Math.pow((x4-x3), 2)+Math.pow((y4-y3),2));
		String s1 = String.valueOf(len1);
		String s2 = String.valueOf(len2);
		if(s2.equals(s1)) {
	                System.out.println("Lines are equal");
		}
		else
	        System.out.println("Lines are not equal");
		

	}
}

