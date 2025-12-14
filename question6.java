
public class question6
{
    public static void main(String[] args)
    {
        int[][] marks={{80,75},{90,85}};
        System.out.println("subjects  english  nepali");
        for(int i=0;i<marks.length;i++)
        {
            System.out.print("Student " + (i + 1) + " \t");
            for(int j=0;j<marks[i].length;j++)
            {
                
                System.out.print(marks[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}