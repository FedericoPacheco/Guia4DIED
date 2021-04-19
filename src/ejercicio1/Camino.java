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
		Coordenada ultimaCoordenada = coordenadas.get(coordenadas.size() - 1);
		Double aux = Math.PI / 180 * radioTierraEnMetros;
		aux = 1 / aux;
		
		this.agregar
		(
			ultimaCoordenada.getLatitud() + desplazamientoLatitud * aux,
			ultimaCoordenada.getLongitud() + desplazamientoLongitud * aux / Math.cos(ultimaCoordenada.getLatitud() * Math.PI / 180)
		);
		
		
	}
}
