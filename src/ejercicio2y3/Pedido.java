package ejercicio2y3;

import java.util.ArrayList;

public abstract class Pedido 
{	
	static Integer contadorId = 0;
	
	protected Integer id;
	protected ArrayList<Producto> productos;
	protected Cadete cadeteAsignado;

	public Pedido()
	{
		id = contadorId;
		productos = new ArrayList<Producto>();
		
		contadorId++;
	}
	
	public Pedido(ArrayList<Producto> productos, Cadete cadeteAsignado)
	{
		id = contadorId;
		this.productos = productos;
		this.cadeteAsignado = cadeteAsignado;
		
		contadorId++;
	}
	
	public setCadeteAsignado(Cadete cadete)
	{
		this.cadeteAsignado = cadete;
	}
	
	public abstract Boolean agregarProducto(Producto unProducto);

	public abstract Double getComision();

	public Double precio()
	{
		return this.precioTotalSinComisiones() * (1 + this.getComision());
	}
	
	private Double precioTotalSinComisiones()
	{
		Double suma = 0.0;
		for (Producto p: productos)
			suma += p.getPrecio();
		
		return suma;
	}
}

