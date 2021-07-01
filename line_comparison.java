public class line_comparison {
public static void main(String args[])
{
int x1=1;
int y1=5;
int x2=3;
int y2=5;
int x3=3;
int y3=5;
int x4=9;
int y4=7;
double len1, len2, compare;
System.out.println("Welcome to Line Comparison Computation Program");
len1 = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
len2 = Math.sqrt(Math.pow((x4-x3), 2)+Math.pow((y4-y3),2));
String s1 = String.valueOf(len1);
String s2 = String.valueOf(len2);
compare = s2.compareTo(s1);
	if(compare>0)
	{
		System.out.println("Line2 is greater than Line1");
	}
	else if(compare<0)
	{
		System.out.println("Line1 is greater than Line2");
	}
else
	System.out.println("Lines are equal");
}
}
