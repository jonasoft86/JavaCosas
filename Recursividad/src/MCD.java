import java.util.Scanner;

public class MCD 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        
        System.out.println("*** MCD ***");
        System.out.println();
        System.out.println("Introduce numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Introduce numero 2: ");
        num2 = sc.nextInt(); 
        
        System.out.println();
        System.out.println("MCM es: "+mcd(num1,num2));
        
        System.out.println();
        System.out.println("MCM recursivo es: "+mcdRecursivo(num1,num2));
    }
    
    static int mcd(int a, int b){
        int divisor;
         
        //Lo primero es seleccionar el menor de los dos
        if (a>b)
            divisor=b;
        else
            divisor=a;
        //Y ahora empiezo a probar si ese número es el mcd o lo son
        //los sucesivos inferiores a él
        while ((a%divisor!=0 || b%divisor!=0) && divisor>1)
            divisor--;
        //Para salir del bucle while, se deben cumplir una de las dos condiciones:
        //- divisor es un mcd de ambos números
        //- divisor ha llegado a valer 1, con lo cual ése es el máximo común divisor
        return divisor;
    }
    
    static int mcdRecursivo(int a, int b)
    {
    	if(b==0)
    	{
    		return a;
    	}
    	else
    	{
    		return mcdRecursivo(b,a%b);
    	}
    }
}
