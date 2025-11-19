import java.util.Scanner;
public class MedicalStore
{
     public static void main(String[] argus)
    {
    //input
    Scanner input=new Scanner(System.in);
    System.out.println("Medicine name:");
    String Name1 = input.nextLine();
    System.out.println("Medicine price");
    double Price1 = input.nextDouble();
    System.out.println("InStock");
    int Stock1 = input.nextInt();
    System.out.println("Prescription");
    input.nextLine();
    String Prescription1 = input.nextLine();

   
    System.out.println("Medicine name:");
    String Name2 = input.nextLine();
    System.out.println("Medicine price");
    double Price2 = input.nextDouble();
    System.out.println("InStock");
    int Stock2 = input.nextInt();
    System.out.println("Prescription");
    input.nextLine();
    String Prescription2 = input.nextLine();
   
    System.out.println("Medicine name:");
    String Name3 = input.nextLine();
    System.out.println("Medicine price");
    double Price3 = input.nextDouble();
    System.out.println("InStock");
    int Stock3 = input.nextInt();
    System.out.println("Prescription");
    input.nextLine();
    String Prescription3 = input.nextLine();
    
    
    //output
    System.out.println("================================================================");
    System.out.println("                        Dharan Aushadhi Pasal                  ");
    System.out.println("================================================================");
    System.out.println("Medicine name    | Price | InStock | Prescription,");
    System.out.println(Name1 + " | " + Price1 + " | " + Stock1 + " | " + Prescription1);
    System.out.println(Name2 + " | " + Price2 + " | " + Stock2 + " | " + Prescription2);
    System.out.println(Name3 + " | " + Price3 + " | " + Stock3 + " | " + Prescription3);
    System.out.println ("================================================================");
    
    
    }
}