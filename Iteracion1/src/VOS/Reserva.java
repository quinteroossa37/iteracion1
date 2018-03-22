package VOS;

import java.sql.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class Reserva {
	
	@JsonProperty (value ="id")
	private Long id;
	
	@JsonProperty (value = "diaInicio")
	private Date diaInicio;
	
	@JsonProperty (value ="diaFin")
	private Date diaFin;
	
	@JsonProperty (value = "precioTotal")
	private double precioTotal;
	
	
	public Reserva (@JsonProperty (value ="id")Long pid, @JsonProperty (value="diaInicia")Date pdiaInicio, @JsonProperty(value="diaFin")Date pdiaFin, @JsonProperty (value ="precioTotal")double pprecioTotal){
		this.id = pid;
		this.diaInicio = pdiaInicio;
		this.diaFin =pdiaFin;
		this.precioTotal=pprecioTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDiaInicio() {
		return diaInicio;
	}

	public void setDiaInicio(Date diaInicio) {
		this.diaInicio = diaInicio;
	}

	public Date getDiaFin() {
		return diaFin;
	}

	public void setDiaFin(Date diaFin) {
		this.diaFin = diaFin;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	

}
