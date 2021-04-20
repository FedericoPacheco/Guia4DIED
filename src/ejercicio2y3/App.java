package ejercicio2y3;

import java.time.LocalTime;

public class App 
{
	public static void main(String[] args) 
	{
		Producto prod1, prod2, prod3, prod4;
		PedidoBasico pedBas1;
		PedidoPremium pedPre1;
		Tramite tram1;
		Cadete cad1;
		
		prod1 = new Producto("prod1", "", 100.0);
		prod2 = new Producto("prod2", "", 200.0);
		prod3 = new Producto("prod3", "", 300.0);
		prod4 = new Producto("prod4", "", 400.0);

		cad1 = new Cadete("Pepe Perez");
		
		pedBas1 = new PedidoBasico();
		pedBas1.agregarProducto(prod1);
		pedBas1.agregarProducto(prod2);
		cad1.agregarPedido(pedBas1);
		pedBas1.registrarServicioCompletado();

		pedPre1 = new PedidoPremium();
		pedPre1.agregarProducto(prod3);
		pedPre1.agregarProducto(prod4);
		cad1.agregarPedido(pedPre1);
		pedPre1.registrarServicioCompletado();
		
		tram1 = new Tramite("tram 1", "", LocalTime.of(8, 30));
		cad1.agregarTramite(tram1);
		tram1.registrarServicioCompletado();
		
		System.out.println(cad1.getMontoTotalACobrar());
	}

}