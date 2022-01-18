public class SpecialNoPattern1
{
public static void main(String[] args)
{
System.out.println("Welcome to java Pattern");

    for(int i=1;i<=5;i++)
    { int k=i;
         for(int j=1;j<=i;j++)
        {        
            System.out.print(k+" ");
            k+=(5-j); 
        }
        
        System.out.println();
    }
}
}


