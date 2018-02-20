package Varios;

public class Primos 
{
    public static void main(String[] args) 
    {
    	int numero = 5;
    	boolean primo = true;
    	
    	for(int i=2;i<numero;i++)
    	{
    		if(numero % i == 0)
    			primo = false;
    	}
    	
    	if(primo)
    		System.out.println("Es primo");
    	else
    		System.out.println("No es primo");
    			
    }
}
