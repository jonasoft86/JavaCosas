package Inm_ThrSafe;


public final class Contacto 
{
	private final String nombre;
	private final int edad;
	
	public Contacto(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public int getEdad()
	{
		return this.edad;
	}
}