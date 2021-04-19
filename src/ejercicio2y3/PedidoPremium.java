package ejercicio2y3;

public class PedidoPremium extends Pedido
{
	private static final Double recargoMinimo = 0.2;
	private static final Integer cantidadProductosRecargoMinimo = 5;
	private static final Double recargoMaximo = 0.3;
	private static final Integer cantidadProductosRecargoMaximo = 20;
	
	public Boolean agregarProducto(Producto unProducto)
	{
		Boolean auxBoolean;
		
		if (productos.size() < cantidadProductosRecargoMaximo)
		{
			productos.add(unProducto);
			auxBoolean = true;
		}
		else
			auxBoolean = false;
		
		return auxBoolean;
	}
}
