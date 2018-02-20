package Inm_ThrSafe;

public class Inmutabilidad 
{
    public static void main(String[] args) 
    {
    	Contacto contacto = new Contacto("Jonathan",27);
    	
    	System.out.println(contacto.getNombre()+" "+contacto.getEdad());
    }
    

}


