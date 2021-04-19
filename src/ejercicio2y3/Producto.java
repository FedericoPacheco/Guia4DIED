package ejercicio2y3;

public class Producto 
{
	static Integer contadorId = 0;
	
	Integer id;
	String nombre;
	String descripcion;
	Double precio;
	
	public Producto()
	{
		id = contadorId;
		contadorId++;
	}
	
	public Producto(String nombre, String descripcion, Double precio)
	{
		id = contadorId;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		
		contadorId++;
	}
	
	public Double getPrecio()
	{
		return precio;
	}
}
