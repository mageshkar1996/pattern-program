public class SpecialNoPattern
{
public static void main(String[] args)
{ int a=0,b=1,c;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
           
            System.out.print(a+" ");
            c=a;
            a=b;
            b=c;        
        }
    System.out.println();
    }
}
}
