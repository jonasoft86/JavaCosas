package poo;

public class Ave extends Animal
{
	public Ave(int edad, String genero, int peso) 
	{
		super(edad, genero, peso);
	}

	@Override
	public void mover()
	{
		System.out.println("ave volando...");
		
	}
}
