public class CapitalM
{
public static void main(String[] args)
{
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=7;j++)
        {
            if(i==j||j+i==8||j==1||j==7)
            {System.out.print("+"+" ");}
            else
            {System.out.print(" "+" ");}
        }
                System.out.println();
}
}
}
