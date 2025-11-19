import java.util.Scanner;

public class Calculator extends Students
{
      public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the first no:");
    int first= input.nextInt();
    System.out.println("Enter the second no:");
    int second= input.nextInt();
    
    System.out.println("The No u have entered is");
 
    System.out.println("First no:" +first);
    System.out.println("Second no" +second);

    
}
}