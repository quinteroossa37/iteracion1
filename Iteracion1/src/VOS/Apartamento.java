package VOS;

import org.codehaus.jackson.annotate.JsonProperty;

public class Apartamento extends Alojamiento {


	//----------------------------------------------------------------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Indica si el apartamento esta amoblado o no
	 */
	@JsonProperty (value ="amoblado")
	private boolean amoblado;


	//----------------------------------------------------------------------------------------------------------------------------------
	// METODO CONSTRUCTOR
	//----------------------------------------------------------------------------------------------------------------------------------

	public Apartamento(Long pid, boolean pDispo, int pMaxPer, String pUbicacion, double pPrecio, int pDias, @JsonProperty(value="amoblado")boolean amoblado) {
		super(pid, pDispo, pMaxPer, pUbicacion, pPrecio, pDias);
		this.amoblado = amoblado;
	}

	
	//----------------------------------------------------------------------------------------------------------------------------------
	// METODOS DE LA CLASE
	//----------------------------------------------------------------------------------------------------------------------------------

	public boolean isAmoblado() {
		return amoblado;
	}


	public void setAmoblado(boolean amoblado) {
		this.amoblado = amoblado;
	}


}
