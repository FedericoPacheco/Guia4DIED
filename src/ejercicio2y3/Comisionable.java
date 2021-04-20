package ejercicio2y3;

public interface Comisionable 
{
	// Se interpretan las comisiones como porcentajes. Los montos adicionales son simplemente dinero.
	public abstract Double getComisionServicio();
	public abstract Double getMontoAdicionalServicio();
	public abstract Double getComisionCadete();
	public abstract Double getMontoAdicionalCadete();
	public abstract Integer fueCompletado();
	public abstract void registrarServicioCompletado();
	public abstract Double getPrecioServicio();
}
