import java.util.Scanner;

public class mynameis extends Students
{
    public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("My Name is:");
    String name = input.nextLine(); 

    System.out.println("Your Name is:");
    String namee=input.nextLine();
    
    System.out.println("Hello, " + name);

}}