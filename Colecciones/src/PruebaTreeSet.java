import java.util.TreeSet;

public class PruebaTreeSet 
{
    public static void main(String[] args) 
    {

    	Articulo primero = new Articulo(1,"Primer Articulo");
    	Articulo segundo = new Articulo(200,"Segundo Articulo");
    	Articulo tercero = new Articulo(3,"Tercero Articulo");
    	
    	TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
    	
    	ordenaArticulos.add(tercero);
    	ordenaArticulos.add(primero);
    	ordenaArticulos.add(segundo);
    	
    	for(Articulo articulo:ordenaArticulos)
    	{
    		System.out.println(articulo.getDescripcion());
    		
    	}
    	
    }
}

class Articulo implements Comparable<Articulo>
{
	public Articulo(int num,String desc)
	{
		numero_articulo = num;
		descripcion = desc;
	}
	
	@Override
	public int compareTo(Articulo o) 
	{
		return numero_articulo - o.numero_articulo;
	}
	
	public String getDescripcion()
	{
		return descripcion;
	}
	
	private int numero_articulo;
	
	private String descripcion;
}