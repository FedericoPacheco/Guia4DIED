package ejercicio1;

public class App 
{
	static public void main (String args[])
	{
		Camino c = new Camino();
		
		c.agregar(30.0, 30.0);
		c.agregar(29.2, 30.4);
		c.agregar(29.7, 30.7);
		c.agregar(29.0, 31.0);
		c.agregar(0, 111 * 1000);
		c.agregar(100 * 1000, 0);
		
		c.imprimir();
		
		System.out.println("-----------");
		Camino.imprimir(c.buscar(new Coordenada(30.0, 30.0), new Coordenada(29.0, 31.0)));
		
		System.out.println("-----------");
		Camino.imprimir(c.buscar(new Coordenada(29.7, 30.7), 120 * 1000));
	}
}
