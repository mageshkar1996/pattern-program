public class Pattern14
{
public static void main(String[] args)
{
    for (int i=1;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print("*"+" ");
        }
            System.out.println();
    }
    for (int k=2;k<=5;k++)
    {
        for(int g=1;g<=k;g++)
        {
            System.out.print("*"+" ");
        }
            System.out.println();
    }
}
}
