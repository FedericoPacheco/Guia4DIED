package ejercicio2y3;

public interface Comisionable 
{
	public abstract Double getComisionServicio();
	public abstract Double getMontoAdicionalServicio();
	public abstract Double getComisionCadete();
	public abstract Double getMontoAdicionalCadete();
	public abstract Integer fueCompletado();
	public abstract void registrarServicioCompletado();
	public abstract Double getPrecioServicio();
}
