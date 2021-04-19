package ejercicio2y3;

public class PedidoPremium extends Pedido
{
	private static final Double recargoMinimo = 0.2;
	private static final Integer cantidadProductosRecargoMinimo = 5;
	private static final Double recargoMaximo = 0.3;
	private static final Integer cantidadProductosRecargoMaximo = 20;
	
	public Boolean agregarProducto(Producto producto)
	{
		Boolean auxBoolean;
		
		if (productos.size() < cantidadProductosRecargoMaximo)
		{
			productos.add(producto);
			auxBoolean = true;
		}
		else
			auxBoolean = false;
		
		return auxBoolean;
	}
	
	public Double getComisionEnvio()
	{
		Double auxDouble;
		
		if (productos.size() <= cantidadProductosRecargoMinimo)
			auxDouble = recargoMinimo;
		else
			auxDouble = recargoMaximo;
		
		return auxDouble;
	}
	
	public Double getComisionCadete()
	{
		return this.fueEntregado() * Cadete.cobroPedidoPremium;
	}
	
	public Double getMontoAdicionalCadete()
	{
		Double auxDouble;
		
		if (productos.size() < Cadete.cantidadProductosEnPedidoPremiumParaCobrarEfectivoExtra)
			auxDouble = 0.0;
		else
			auxDouble = Cadete.efectivoExtraEnPedidoPremium;
		
		return this.fueEntregado() * auxDouble;
	}
}
