package VOS;

import org.codehaus.jackson.annotate.*;



public class Alojamiento {

	//----------------------------------------------------------------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Id del alojamiento
	 */
	@JsonProperty(value="id")
	private Long id;

	/**
	 * Disponibilidad del alojamiento 
	 */
	@JsonProperty (value="disponibilidad")
	private boolean disponibilidad;

	/**
	 * Maximo de personas que en el alojamiento
	 */
	@JsonProperty (value="maxPersonas")
	private int maxPersonas;

	/**
	 * Ubicacion del alojamiento
	 */
	@JsonProperty (value = "ubicacion")
	private String ubicacion;

	/**
	 * Precio del alojamiento
	 */
	@JsonProperty (value = "precio")
	private double precio;

	/**
	 * Tiempo de cancelacion en dias 
	 */
	@JsonProperty (value ="diasCancelacion")
	private int diasCancelacion;


	//----------------------------------------------------------------------------------------------------------------------------------
	// METODO CONSTRUCTOR
	//----------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Metodo constructor de la clase alojamiento
	 * @param pid - id del alojamiento
	 * @param pDispo - disponibilidad del alojamiento
	 * @param pMaxPer	- maximo de personas por el alojamiento
	 * @param pUbicacion - ubicacion del alojamiento
	 * @param pPrecio - precio del alojamiento 
	 * @param pDias  - dias de cancelacion del alojamiento
	 */

	public Alojamiento (@JsonProperty(value="id") Long pid,@JsonProperty(value="disponibilidad")boolean pDispo, @JsonProperty(value="maxPersonas")int pMaxPer,
			@JsonProperty(value="ubicacion")String pUbicacion, @JsonProperty(value="precio")double pPrecio, @JsonProperty(value="diasCancelacion")int pDias)
	{
		this.id = pid;
		this.disponibilidad = pDispo;
		this.maxPersonas = pMaxPer;
		this.ubicacion = pUbicacion;
		this.precio = pPrecio;
		this.diasCancelacion = pDias;
	}


	//----------------------------------------------------------------------------------------------------------------------------------
	// METODOS DE LA CLASE
	//----------------------------------------------------------------------------------------------------------------------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getMaxPersonas() {
		return maxPersonas;
	}

	public void setMaxPersonas(int maxPersonas) {
		this.maxPersonas = maxPersonas;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDiasCancelacion() {
		return diasCancelacion;
	}

	public void setDiasCancelacion(int diasCancelacion) {
		this.diasCancelacion = diasCancelacion;
	}









}
