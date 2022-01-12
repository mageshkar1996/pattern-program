public class NoPattern4
{
public static void main(String[] args)
    {   
           for(int i=1;i<=5;i++)
           {    int k =10;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(k+" ");
                    k-=2;                    
                }
                
           System.out.println();
           }
    }

}
