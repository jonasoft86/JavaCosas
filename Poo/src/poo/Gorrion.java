package poo;

public class Gorrion extends Ave implements Volador{

	public Gorrion(int edad, String genero, int peso) 
	{
		super(edad, genero, peso);
	}

	@Override
	public void volar() 
	{
		System.out.println("volando...");
	}

}
