public class line_comparison {
public static void main(String args[])
{
int x1=3;
int y1=5;
int x2=9;
int y2=7;
int x3=6;
int y3=7;
int x4=2;
int y4=5;
double len1, len2, line_equal;
System.out.println("Welcome to Line Comparison Computation Program");
len1 = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
len2 = Math.sqrt(Math.pow((x4-x3), 2)+Math.pow((y4-y3),2));
String s1 = String.valueOf(len1);
String s2 = String.valueOf(len2);
if(s2.equals(s1))
	{
		System.out.println("Lines are equal");
	}
else
	System.out.println("Lines are not equal");
}
}
