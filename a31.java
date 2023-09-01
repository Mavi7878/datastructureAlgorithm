public class a31 {
   public static void main (String hathi[])
   {
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=7;j++)
        { boolean k=true;
            if((5-i<=j)&&(j<=3+i)&&k)
            {
                System.out.print("*");
                k=false;
            }
            else
            {
              System.out.print(" ");
              k=true;
            }
        }
        System.out.println();
    }
   }
}
