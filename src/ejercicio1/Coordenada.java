package ejercicio1;

public class Coordenada 
{
	private Double latitud;
	private Double longitud;
	
	public Coordenada()
	{
		latitud = longitud = 0.0;
	}
	
	public Coordenada(Double latitud, Double longitud)
	{
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public Boolean equals(Coordenada otraCoordenada)
	{
		return 
				(latitud == otraCoordenada.latitud) &&
				(longitud == otraCoordenada.longitud);
	}
	
	public String toString()
	{
		return "[lat.: " + latitud + "; long.: " + longitud + "]";
	}
	
	/*
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	*/
}
