package VOS;

import org.codehaus.jackson.annotate.JsonProperty;

public class ViviendaEspecial extends Alojamiento{


	//----------------------------------------------------------------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 */
	@JsonProperty (value="seguro")
	private String seguro;


	//----------------------------------------------------------------------------------------------------------------------------------
	// METODO CONSTRUCTOR
	//----------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param pid
	 * @param pDispo
	 * @param pMaxPer
	 * @param pUbicacion
	 * @param pPrecio
	 * @param pDias
	 * @param seguro
	 */
	public ViviendaEspecial(Long pid, boolean pDispo, int pMaxPer, String pUbicacion, double pPrecio, int pDias, String pseguro) {
		super(pid, pDispo, pMaxPer, pUbicacion, pPrecio, pDias);
		this.seguro = pseguro;
	}

	//----------------------------------------------------------------------------------------------------------------------------------
	// METODOS DE LA CLASE
	//----------------------------------------------------------------------------------------------------------------------------------

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}



}
