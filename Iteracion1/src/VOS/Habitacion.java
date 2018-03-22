package VOS;

import org.codehaus.jackson.annotate.JsonProperty;

public class Habitacion extends Alojamiento{

	
	@JsonProperty (value ="minNoches")
	private int minNoches;
	
	@JsonProperty (value ="tipo")
	private String tipo;
	
	
	public Habitacion(Long pid, boolean pDispo, int pMaxPer, String pUbicacion, double pPrecio, int pDias, @JsonProperty(value="minNoches")int pMinNoches, @JsonProperty(value="Tipo")String pTipo) {
		super(pid, pDispo, pMaxPer, pUbicacion, pPrecio, pDias);
		// TODO Auto-generated constructor stub
		this.minNoches = pMinNoches;
		this.tipo = pTipo;
	}


	public int getMinNoches() {
		return minNoches;
	}


	public void setMinNoches(int minNoches) {
		this.minNoches = minNoches;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	

}
