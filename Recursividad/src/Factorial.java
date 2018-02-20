import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("*** Factorial Numero ***");
        System.out.println();
        System.out.println("Introduce un numero entero >0 : ");
        num = sc.nextInt();
        
        if(num<0)
        {
	        do{
	            System.out.print("Introduce un numero entero >0 : ");
	            num = sc.nextInt();
	         }while(num<=0);
        }
        
        System.out.println();
        System.out.println("Resultado: "+factorialN(num));
        
        System.out.println();
        System.out.println("Resultado recursivo: "+factorialNRecursivo(num));
    }
    
    public static int factorialN(int n)
    {
    	int producto = 1;
    	
    	if(n==1)
    	{
    		return 1;
    	}
    	else
    	{
    		for(int i = n; i>=1 ;i--)
    		{
    			producto *= i;
    		}
    	}
    	
    	return producto;
    }
    
    public static int factorialNRecursivo(int n)
    {
    	if(n==0)
    	{
    		return 1;
    	}
    	else
    	{
    		return n*factorialNRecursivo(n-1);
    	}
    }
}
