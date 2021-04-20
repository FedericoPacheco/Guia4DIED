package ejercicio2y3;

import java.util.ArrayList;

public class Cadete 
{
	static Integer contadorId = 0;
	
	public static final Double recargoPedidoBasico = 0.1;
	public static final Double recargoPedidoPremium = 0.15;
	public static final Integer cantidadProductosEnPedidoPremiumParaCobrarEfectivoExtra = 10;
	public static final Double montoAdicionalEnPedidoPremium = 50.0;
	public static final Double recargoTramite = 0.0;
	public static final Double montoAdicionalTramite = 20.0;
	
	
	private Integer id;
	private String nombre;
	private ArrayList <Comisionable> serviciosAPrestar;
	
	public Cadete()
	{
		id = contadorId;
		serviciosAPrestar = new ArrayList<Comisionable>();
		
		contadorId++;
	}
	
	public Cadete(String nombre)
	{
		id = contadorId;
		this.nombre = nombre;
		serviciosAPrestar = new ArrayList<Comisionable>();
		
		contadorId++;
	}
	
	public void agregarPedido(Pedido pedido)
	{
		pedido.setCadeteAsignado(this);
		serviciosAPrestar.add(pedido);
	}
	
	public void agregarTramite(Tramite tramite)
	{
		serviciosAPrestar.add(tramite);
	}
	
	public Double getMontoTotalACobrar()
	{
		Double suma = 0.0;
		
		for(Comisionable s: serviciosAPrestar)
			suma += (s.getPrecioServicio() + s.getMontoAdicionalServicio()) * s.getComisionCadete() + s.getMontoAdicionalCadete();
		
		return suma;
	}
}


