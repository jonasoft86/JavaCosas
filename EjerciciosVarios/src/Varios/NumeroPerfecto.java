package Varios;

/*
 * Ejemplo :
 * 
 * 6 = 1 + 2 + 3
 * 28 = 1 + 2 + 4 + 7 + 14
 */

public class NumeroPerfecto 
{
    public static void main(String[] args) 
    {
    	int numero = 6;
    	int divisores = 0;
    	
    	for(int i=1;i<numero;i++)
    	{
    		if(numero % i == 0)
    			divisores = divisores + i;
    	}
    	
    	if(divisores==numero)
    		System.out.println("El numero es perfecto");
    	else
    		System.out.println("no es perfecto");
    }
}
