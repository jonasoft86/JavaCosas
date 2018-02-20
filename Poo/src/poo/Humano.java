package poo;

public class Humano 
{
	String nombre;
	int edad;
	int peso;
	String colorOjos;
	
	public void hablar()
	{
		System.out.println("Hola mi nombre es: "+this.nombre);
		System.out.println("Peso: "+this.peso);
		System.out.println("mi edad es: "+this.edad);
		System.out.println("mi color de ojos es: "+this.colorOjos);
	}
	
	public void comer()
	{
		System.out.println("comiendo...");
	}
	
	public void caminar()
	{
		System.out.println("caminando...");
	}
	
	public void trabajar()
	{
		System.out.println("trabajando...");
	}
}
