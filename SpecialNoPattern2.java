public class SpecialNoPattern2
{
public static void main(String[] args)
{
System.out.println("Welcome to java Pattern");

    for(int i=1;i<=4;i++)
    { int k=0;
         for(int j=1;j<=i;j++)
        {        
            System.out.print(k+" ");
            k+=(i-1); 
        }
        
        System.out.println();
    }
}
}


