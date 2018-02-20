import java.util.HashMap;
import java.util.Map;

public class PruebaMapa 
{
    public static void main(String[] args) 
    {
    	HashMap<String,Empleado> personal = new HashMap<String,Empleado>();
    	personal.put("145", new Empleado("Juan"));
    	personal.put("146", new Empleado("Jonathan"));
    	personal.put("147", new Empleado("Mauricio"));
    	personal.put("148", new Empleado("Catalina"));
    	
    	/*
    	System.out.println(personal);
    	personal.remove("147");
    	System.out.println(personal);
    	*/
    	
    	for(Map.Entry<String, Empleado> entrada: personal.entrySet())
    	{
    		String clave = entrada.getKey();
    		
    		Empleado valor = entrada.getValue();
    		
    		System.out.println("Clave: "+clave+" Valor: "+valor);
    	}
    	
    	
    }
}

class Empleado 
{
	public Empleado(String n)
	{
		nombre = n;
		sueldo = 2000;
	}
	
	public String toString()
	{
		return "[Nombre="+ nombre + ", sueldo="+ sueldo +"]";
	}
	
	private String nombre;
	
	private double sueldo;
}
