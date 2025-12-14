
public class question7
{
    public static void main(String[] args)
    {
        String[][] seats={{"ram","shyam","hari"},{null,null,null}};
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {

                if (seats[i][j] == null)
                {
                    System.out.print("[empty]\t");
                } else {
                    System.out.print(seats[i][j] + "\t");
                }
            }
            System.out.println();
        }
        
    }
}