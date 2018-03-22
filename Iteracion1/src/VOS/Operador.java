package VOS;

import java.sql.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class Operador {
	
	@JsonProperty (value ="id")
	private Long id;

	@JsonProperty (value ="login")
	private String login;

	@JsonProperty (value ="password")
	private String password;

	@JsonProperty (value ="nombre")
	private String nombre;
	
	@JsonProperty (value ="miembro")
	private boolean miembro;
	
	@JsonProperty (value ="ganancias")
	private double ganancias;
	
	@JsonProperty (value ="registro")
	private boolean registro;
	
	@JsonProperty (value ="telefono")
	private int telefono;
	
	@JsonProperty (value ="tipoOperador")
	private String tipoOperador;
	
	@JsonProperty (value ="horaApertura")
	private String horaApertura;
	
	@JsonProperty (value ="horaCierre")
	private String horaCierre;
	
	

	public Operador (@JsonProperty(value="id") Long pid,@JsonProperty(value="login")String pLogin, @JsonProperty(value="password")String pPass,
			@JsonProperty(value="nombre")String pnombre, @JsonProperty(value="miembro")boolean pMiembro, @JsonProperty(value="registro")boolean pRegistro, @JsonProperty(value="ganancias")double pGanancias,
			@JsonProperty(value="telefono")int ptelefono, @JsonProperty (value ="tipoOperador")String pTipoOp, @JsonProperty (value ="horaApertura") String phoraApertura,  @JsonProperty (value ="horaCierre") String phoracierre)
	{
		this.id = pid;
		this.login = pLogin;
		this.password = pPass;
		this.nombre = pnombre;
		this.miembro = pMiembro;
		this.ganancias = pGanancias;
		this.registro = pRegistro;
		this.telefono = ptelefono;
		this.tipoOperador = pTipoOp;
		this.horaApertura = phoraApertura;
		this.horaCierre = phoracierre;
		
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isMiembro() {
		return miembro;
	}


	public void setMiembro(boolean miembro) {
		this.miembro = miembro;
	}


	public double getGanancias() {
		return ganancias;
	}


	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}


	public boolean isRegistro() {
		return registro;
	}


	public void setRegistro(boolean registro) {
		this.registro = registro;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getTipoOperador() {
		return tipoOperador;
	}


	public void setTipoOperador(String tipoOperador) {
		this.tipoOperador = tipoOperador;
	}


	public String getHoraApertura() {
		return horaApertura;
	}


	public void setHoraApertura(String horaApertura) {
		this.horaApertura = horaApertura;
	}


	public String getHoraCierre() {
		return horaCierre;
	}


	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}



	
}
