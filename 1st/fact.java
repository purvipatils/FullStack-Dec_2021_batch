import java.util.Scanner;

public class Fact
{
   public static void main(String[] args)
   {
      int n, r, ncr, npr;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Value of n: ");
      n = s.nextInt();
      System.out.print("Enter the Value of r: ");
      r = s.nextInt();
      
      npr = (fact(n)) / (fact(n-r));
      ncr = npr/fact(r);
      
      System.out.println("\nnCr = " +ncr);
      System.out.println("nPr = " +npr);
   }
   public static int fact(int num)
   {
      int fact=1;
      for(int i=1; i<=num; i++)
         fact *= i;
      return fact;
   }
}