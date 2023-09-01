class a29
{
    public static void main (String hathi[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=9;j++ )
            {
                if((6-i<=j)&&(j<=4+i))
                {
                    System.out.print("*");
                
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}