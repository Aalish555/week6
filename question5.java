import java.util.Scanner;
public class question5
{
    public static void main(String[] args)
    {
         Scanner input=new Scanner(System.in);
         String[] districts={"Morang","Kathmandu","Kaski","Sindhuli"};
         for(int i=0;i<districts.length;i++)
         {
             System.out.println(i+". "+districts[i]);
        }
        System.out.println("Enter number of districts u want to enter: ");
        int indecs=input.nextInt();
        input.nextLine();
        String[] updated;
        updated=new String[indecs];
        System.out.println("enter districts");
        for(int i=0;i<updated.length;i++)
         {
             System.out.println("enter district for element[ "+i+"]");
             String updated_name=input.nextLine();
             updated[i]=updated_name;
         }
         for(int i=0;i<updated.length;i++)
         {
             System.out.println(i+". "+updated[i]);
        }
    }
}