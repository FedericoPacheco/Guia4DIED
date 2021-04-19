package ejercicio2y3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Pedido 
{	
	static Integer contadorId = 0;
	
	protected Integer id;
	protected ArrayList<Producto> productos;
	protected Cadete cadeteAsignado;
	protected LocalDateTime fechaEntrega;
	
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
	
	public void setCadeteAsignado(Cadete cadete)
	{
		this.cadeteAsignado = cadete;
	}
	
	public abstract Boolean agregarProducto(Producto producto);
	
	// Se intepreta la comision como un porcentaje:
	public abstract Double getComisionEnvio();  
	public abstract Double getComisionCadete();
	public abstract Double getMontoAdicionalCadete();

	public Double precioEnvio()
	{
		return this.precioTotalSinComisiones() * (1 + this.getComisionEnvio());
	}
	
	private Double precioTotalSinComisiones()
	{
		Double suma = 0.0;
		for (Producto p: productos)
			suma += p.getPrecio();
		
		return suma;
	}
	
	public Integer fueEntregado()
	{
		Integer auxInteger;
		
		if (fechaEntrega == null)
			auxInteger = 0;
		else
			auxInteger = 1;
		
		return auxInteger;
	}
	
	public void registrarEntrega()
	{
		fechaEntrega = LocalDateTime.now();
	}
}

