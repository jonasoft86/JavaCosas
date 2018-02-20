package pro_generica;

public class UsoPareja 
{
    public static void main(String[] args) 
    {
    	Pareja<String> una = new Pareja<String>();
    	
    	una.setPrimero("Jonathan");
    	
    	System.out.println(una.getPrimero());
    }
}

class Persona
{
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}
	
	private String nombre;
}