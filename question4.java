
public class question4
{
    public static void main(String[] args)
    {
        int[] values={10,20,30,40,50};
        int sum=0;
        int highest=values[0];
        int lowest=values[0];
        for(int i=0;i<values.length;i++)
        {
            System.out.println(values[i]);
            sum=sum+values[i];
            if(values[i]>highest)
            {
                highest=values[i];
            }
             if(values[i]<lowest)
            {
                lowest=values[i];
            }
        }
        System.out.println("sum is "+sum);
        System.out.println("avg is "+sum/values.length);
        System.out.println("highest is "+highest);
        System.out.println("lowest is "+lowest);
        
        
    }
}