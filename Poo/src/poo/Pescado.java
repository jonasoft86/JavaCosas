package poo;

public class Pescado extends Animal
{
	public Pescado(int edad, String genero, int peso) 
	{
		super(edad, genero, peso);
	}

	public void nadar()
	{
		System.out.println("nadando...");
	}

	@Override
	public void mover() 
	{
		System.out.println("pescado nadando...");	
	}
}
