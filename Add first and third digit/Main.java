import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1 =in.nextInt();
	  int b= n1/100;
      int c=n1%10;
      System.out.println(b+c);
	}
}