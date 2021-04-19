package ejercicio2y3;

import java.util.ArrayList;

public class PedidoBasico extends Pedido 
{
	private static final Double recargoEstandar = 0.05;
	private static final Double recargoExpress = 0.2;
	private static final Integer cantidadMaximaProductos = 5;
	
	private Boolean esExpress;

	public PedidoBasico()
	{
		super();
		esExpress = false;
	}
	
	public PedidoBasico(ArrayList<Producto> productos, Cadete cadeteAsignado)
	{
		super(productos, cadeteAsignado);
		esExpress = false;
	}
	
	public void esExpress()
	{
		this.esExpress = true;
	}
	
	public Boolean agregarProducto(Producto unProducto)
	{
		Boolean auxBoolean;
		
		if (productos.size() < cantidadMaximaProductos)
		{
			productos.add(unProducto);
			auxBoolean = true;
		}
		else
			auxBoolean = false;
		
		return auxBoolean;
	}
	
	public Double getComision()
	{
		Double auxDouble;
		
		if (esExpress)
			auxDouble = recargoExpress;
		else
			auxDouble = recargoEstandar;
		
		return auxDouble;
	}
}
