import java.util.Scanner;

public class scanner
{
    public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the first no:");
    int firstno=input.nextInt();
    System.out.println(firstno);
    
    // temporary operator 
    int age = 18;
    // ()---> conditional
    String isValid=(age>=18)? "Driving is allowed" : "Draving is not allowed";
    System.out.println(isValid);
}
}