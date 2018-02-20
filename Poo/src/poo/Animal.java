package poo;

public abstract class Animal 
{
	int edad;
	String genero;
	int peso;
	
	public Animal(int edad,String genero,int peso)
	{
		this.edad = edad;
		this.genero = genero;
		this.peso = peso;
	}
	
	public void comer()
	{
		System.out.println("comiendo...");
	}
	
	public void dormir()
	{
		System.out.println("durmiendo...");
	}
	
	public abstract void mover();
}
