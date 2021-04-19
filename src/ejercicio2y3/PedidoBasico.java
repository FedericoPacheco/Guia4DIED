package ejercicio2y3;

public class PedidoBasico extends Pedido 
{
	private static final Double recargoEstandar = 0.05;
	private static final Double recargoExpress = 0.2;
	private static final Integer cantidadMaximaProductos = 5;
	
	private Boolean esExpress;

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
}
