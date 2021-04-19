package ejercicio2y3;

import java.util.ArrayList;

public class Cadete 
{
	static Integer contadorId = 0;
	
	static final Double cobroPedidoBasico = 0.1;
	static final Double cobroPedidoPremium = 0.15;
	static final Integer cantidadProductosEnPedidoPremiumParaCobrarEfectivoExtra = 10;
	static final Double efectivoExtraEnPedidoPremium = 50.0;
	
	private Integer id;
	private String nombre;
	private ArrayList <Pedido> pedidosALlevar;
	
	public Cadete()
	{
		id = contadorId;
		pedidosALlevar = new ArrayList<Pedido>();
		
		contadorId++;
	}
	
	public Cadete(String nombre)
	{
		id = contadorId;
		this.nombre = nombre;
		pedidosALlevar = new ArrayList<Pedido>();
		
		contadorId++;
	}
	
	public void agregarPedido(Pedido pedido)
	{
		pedido.setCadeteAsignado(this);
		pedidosALlevar.add(pedido);
	}
	
	public Double comisiones() // total a cobrar
	{
		
	}
}


