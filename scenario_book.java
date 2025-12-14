
public class scenario_book
{
    public static void main(String[] args) 
    {
        System.out.println("LMU ID: 25029870");
        String[] categories={"Fiction","Nepali"};
        String[][] titles=new String[2][1];
        Double[][] prices=new Double[2][1];
        
        titles[0][0]="Karnali Blues";
        prices[0][0]=750.00;
        
        titles[1][0]="Muna Madan";
        prices[1][0]=500.00;
        
        for (int i = 0; i < categories.length; i++) 
        {
            System.out.println("Category: " + categories[i]);

            for (int j = 0; j < titles[i].length; j++) 
            {

                if (titles[i][j] != null) {
                    System.out.println("Title: " +titles[i][j]);
                    System.out.println("Price: "+prices[i][j]);
                }
            }
            System.out.print("\n");
        }
}
}