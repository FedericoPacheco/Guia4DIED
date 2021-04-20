package ejercicio2y3;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Tramite implements Comisionable
{
	private static Integer contadorId = 0;
	private static final Double recargoTramite = 0.0;
	private static final Double montoAdicionalTramite = 20.0;
	private static final Double precioTramite = 50.0;
	
	private Integer id;
	private String nombre;
	private String direccion;
	private LocalTime horaParaRealizarse;
	private LocalDateTime fechaHoraRealizacion;
	
	public Tramite(String nombre, String direccion, LocalTime horaParaRealizarse)
	{
		id = contadorId;
		this.nombre = nombre;
		this.direccion = direccion;
		this.horaParaRealizarse = horaParaRealizarse;
	
		contadorId++;
	}
	
	public Double getComisionServicio()
	{
		return this.fueCompletado() * recargoTramite;
	}
	
	public Double getMontoAdicionalServicio()
	{
		return this.fueCompletado() * montoAdicionalTramite;
	}
	
	public Double getComisionCadete()
	{
		return this.fueCompletado() * Cadete.recargoTramite;
	}
	
	public Double getMontoAdicionalCadete()
	{
		return this.fueCompletado() * Cadete.montoAdicionalTramite;
	}
	
	public Integer fueCompletado() 
	{
		Integer auxInteger;
		
		if (fechaHoraRealizacion == null)
			auxInteger = 0;
		else
			auxInteger = 1;
		
		return auxInteger;
	}
	
	public void registrarServicioCompletado()
	{
		fechaHoraRealizacion = LocalDateTime.now();
	}
	
	public Double getPrecioServicio()
	{
		return this.fueCompletado() * precioTramite;
	}
}

