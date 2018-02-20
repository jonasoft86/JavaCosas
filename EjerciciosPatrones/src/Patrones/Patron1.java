package Patrones;

import java.util.Scanner;

/*        *
 *       **
 *      ***
 *     ****
 *    *****
 *   ******  
 *  *******
 */

public class Patron1 
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Ingrese un numero: ");
    	int n = scanner.nextInt();
    	
    	for(int fila=1; fila<=n; fila++)
    	{
    		for(int espacio=1; espacio <= (n-fila); espacio++)
    		{
    			System.out.print(" ");
    		}
    		
    		for(int columna=1;columna<=fila;columna++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
