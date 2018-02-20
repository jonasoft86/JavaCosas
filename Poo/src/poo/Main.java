package poo;

public class Main 
{
    public static void main(String[] args) 
    {
    	Animal gorrion = new Gorrion(2,"F",6);
    	//gorrion.mover();
    	
    	Animal pescado = new Pescado(3,"M",2);
    	//pescado.mover();
    	
    	//Polimorfismo
    	moverAnimales(gorrion);
    	moverAnimales(pescado);
    }
    
    public static void moverAnimales(Animal animal)
    {
    	animal.mover();
    }
}
