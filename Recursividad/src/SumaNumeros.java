import java.util.Scanner;

public class SumaNumeros 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("*** Sumar N numeros ***");
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
        System.out.println("Resultado: "+sumarN(num));
        
        System.out.println();
        System.out.println("Resultado recursivo: "+sumarNRecursivo(num));
    }
    
    public static int sumarN(int n)
    {
    	int suma = 0;
    	
        if(n == 1)
            return 1;
        
    	for(int i=0; i<=n;i++)
    	{
    		suma = suma + i;
    	}
    	
    	return suma;
    }
    
    public static int sumarNRecursivo(int n)
    {
    	int suma=0;
    	
        if(n == 1)
        {
            return 1;
        }
        else 
        {
        	return  n + sumarNRecursivo(n-1);
        }
        
    }
}
