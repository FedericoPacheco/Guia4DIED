package ejercicio1;

import java.util.ArrayList;

public class Camino 
{
	static final Double radioTierraEnMetros = 6378000.0;
	
	ArrayList <Coordenada> coordenadas;
	
	public Camino()
	{
		coordenadas = new ArrayList <Coordenada>();
	}
	
	public void agregar(Coordenada coordenada)
	{
		coordenadas.add(coordenada);
	}
	
	public void agregar(Double latitud, Double longitud)
	{
		this.agregar(new Coordenada(latitud, longitud));
	}
	
	public void agregar(Integer desplazamientoLatitud, Integer desplazamientoLongitud)
	{
		this.agregar (coordenadaDesplazada(coordenadas.get(coordenadas.size() - 1), desplazamientoLatitud, desplazamientoLongitud));
	}
	
	private Coordenada coordenadaDesplazada(Coordenada coordenada, Integer desplazamientoLatitud, Integer desplazamientoLongitud)
	{
		// Aproximacion:
		Double aux = Math.PI / 180 * radioTierraEnMetros;
		aux = 1 / aux;
		
		return 
				new Coordenada
				(
						coordenada.getLatitud() + desplazamientoLatitud * aux,
						coordenada.getLongitud() + desplazamientoLongitud * aux / Math.cos(coordenada.getLatitud() * Math.PI / 180)
				);
	}
	
	public ArrayList<Coordenada> buscar(Coordenada noroeste, Coordenada sureste)
	{	
		ArrayList<Coordenada> auxArrayList = new ArrayList<Coordenada>();
		Double latitudNoroste = noroeste.getLatitud();
		Double longitudNoroste = noroeste.getLongitud();
		Double latitudSureste = sureste.getLatitud();
		Double longitudSureste = sureste.getLongitud();
		
		for (Coordenada c: coordenadas)
			if 
			(
					c.getLatitud() < latitudNoroste   &&
					c.getLatitud() > latitudSureste   &&
					c.getLongitud() > longitudNoroste &&
					c.getLongitud() < longitudSureste
			)
				auxArrayList.add(c);
		
		return auxArrayList;
	}
	
	public ArrayList<Coordenada> buscar(Coordenada centro, Integer radio)
	{	
		Coordenada noroeste = coordenadaDesplazada(centro, radio, (-1) * radio);
		Coordenada sureste = coordenadaDesplazada(centro, (-1) * radio, radio);
		
		return this.buscar(noroeste, sureste);
	}
	
	public void imprimir()
	{
		this.imprimir(coordenadas);
	}
	
	static public void imprimir(ArrayList<Coordenada> l)
	{
		for (Coordenada c: l)
			System.out.println(c.toString());
	}
}
