package VOS;

import org.codehaus.jackson.annotate.JsonProperty;

public class Servicio {

	@JsonProperty (value ="id")
	private Long id;
	
	@JsonProperty (value ="costo")
	private double costo;
	
	@JsonProperty (value ="nombre")
	private String nombre;
	
	
	
	public Servicio (@JsonProperty(value ="id")Long pid, @JsonProperty(value="costo")double pcosto,
						@JsonProperty(value ="nombre")String pnombre){
		this.id =pid;
		this.costo = pcosto;
		this.nombre = pnombre;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
