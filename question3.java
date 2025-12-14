import java.util.Scanner;
public class question3
{
    static String[] names={"ram","shyam","hari","patel","sita"};
    public static void main( String[] args)
    {
        Scanner input=new Scanner(System.in);
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println("name at index 2: "+names[2]);
        System.out.println("which index do you want to update the array(0-4):");
        int index=input.nextInt();
        input.nextLine();
        System.out.println("enter updated value");
        String updated_name=input.nextLine();
        names[index]=updated_name;
            for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        
    }
}