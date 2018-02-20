import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

    public static void main(String[] args) 
    {

    	LinkedList<String> personas = new LinkedList<String>();
    	
    	personas.add("Jonathan");
    	personas.add("Mauricio");
    	personas.add("Catalina");
    	personas.add("Camilo");
    	
    	ListIterator<String> it = personas.listIterator();
    	it.next();
    	
    	it.add("Sandra");
    	
    	for(String persona:personas)
    	{
    		System.out.println(persona);
    		
    	}
    }

}