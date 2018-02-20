package pro_generica;

import java.util.ArrayList;

public class PruebaArrayList 
{
    public static void main(String[] args) 
    {
    	
    	ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    	
    	empleados.add(new Empleado("Jona",27,3000));
    	empleados.add(new Empleado("Camilo",12,5000));
    	empleados.add(new Empleado("Mauricio",28,6000));
    	
    	for(Empleado empleado:empleados)
    	{
    		System.out.println(empleado);
    	}
    }
}


class Empleado 
{
	public Empleado(String nombre,int edad, double salario)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String toString()
	{
		return "El empleado se llama "+nombre+ " tiene "+edad+" y un salario de "+salario;
	}
	
	private String nombre;
	
	private int edad;
	
	private double salario;
}