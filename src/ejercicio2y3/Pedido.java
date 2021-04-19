package ejercicio2y3;

import java.util.ArrayList;

public abstract class Pedido 
{	
	static Integer contadorId = 0;
	
	protected ArrayList<Producto> productos;
	protected Cadete cadeteAsignado;

	Pedido()
	{
		productos = new ArrayList<Producto>();
		cadeteAsignado = new Cadete();
	}
	
	public abstract Boolean agregarProducto(Producto unProducto);
}

