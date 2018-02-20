package ID;

public class Messi 
{
	Barcelona barcelona = new Barcelona();
	
	public Messi(Barcelona bar)
	{
		this.barcelona = bar;
	}
	
	public void setBarcelona(Barcelona bar)
	{
		this.barcelona = bar;
	}
	
	public Barcelona getEquipo()
	{
		return barcelona;
	}
}
