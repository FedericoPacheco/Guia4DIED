package ejercicio2y3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Pedido implements Comisionable
{	
	static Integer contadorId = 0;
	
	protected Integer id;
	protected ArrayList<Producto> productos;
	protected Cadete cadeteAsignado;
	protected LocalDateTime fechaHoraEnvioCompletado;
	
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
	public abstract Double getComisionServicio();  // Comision del envio.
	public abstract Double getComisionCadete();
	public abstract Double getMontoAdicionalCadete();

	public Double getPrecioServicio()
	{
		return this.precioTotalSinComisiones() * (1 + this.getComisionServicio());
	}
	
	private Double precioTotalSinComisiones()
	{
		Double suma = 0.0;
		for (Producto p: productos)
			suma += p.getPrecio();
		
		return suma;
	}
	
	public Integer fueCompletado()
	{
		Integer auxInteger;
		
		if (fechaHoraEnvioCompletado == null)
			auxInteger = 0;
		else
			auxInteger = 1;
		
		return auxInteger;
	}
	
	public void registrarServicioCompletado()
	{
		fechaHoraEnvioCompletado = LocalDateTime.now();
	}
}

