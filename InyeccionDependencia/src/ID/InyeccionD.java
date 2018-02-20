package ID;

/*
 * Definicion :  nuestras piezas de software 
 * sean independientes comunicándose únicamente a 
 * través de un interface
 */

public class InyeccionD 
{
    public static void main(String[] args) 
    {
    	//Inyeccion dependencia simple
    	Messi messi = new Messi(new Barcelona());
    	messi.getEquipo().mostrar();
    	
    	//Inyeccion dependencia con Intefaz
    	Messi2 messi2 = new Messi2(new Barcelona2());
    	messi2.mostrarEquipo();
    }
    
    
}

