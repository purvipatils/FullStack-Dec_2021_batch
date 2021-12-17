import java.util.Scanner;
public class IncrementDecrement
{
   public static void main(String[] args)
   {
      
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
           int  num = sc.nextInt();

    if(num>5){
      
      num++;
    }

     
      System.out.println("increment is\t"+num);


      if(num>5){
      num++;

      System.out.println("decrement is\t"+num);
     }
   }
}