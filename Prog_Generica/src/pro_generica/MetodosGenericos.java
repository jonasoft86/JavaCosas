package pro_generica;

public class MetodosGenericos 
{
    public static void main(String[] args) 
    {
    	String nombres[] = {"Jose", "Maria", "Pepe"};
    	
    	String elemntos = MisMatrices.getElementos(nombres);
    	
    	System.out.println(elemntos);
    	
    	Empleado listaEmpleados[] = {
    			new Empleado("Jona",27,3000),
    			new Empleado("Mauricio",28,2000),
    			new Empleado("Catalina",17,7000),
    			new Empleado("Jose",67,9000),
    	};
    	
    	System.out.println(MisMatrices.getElementos(listaEmpleados));
    }
}

class MisMatrices
{
	public static <T> String getElementos(T[]a)
	{
		return "El array tiene "+a.length+" elementos";
	}
}