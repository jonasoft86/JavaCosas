package Varios;

public class Cifras
{
    public static void main(String[] args) 
    {
    	int numero = 22;
    	int cifras = 1;
    	
    	while(numero>=10)
    	{
    		numero = numero/10;
    		cifras++;
    	}
    	
    	System.out.println("El numero "+numero+" tiene "+cifras+" cifras");
    }
}
