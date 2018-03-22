package VOS;

import org.codehaus.jackson.annotate.JsonProperty;

public class Cliente {

	@JsonProperty (value ="id")
	private Long id;

	@JsonProperty (value ="login")
	private String login;

	@JsonProperty (value ="password")
	private String password;

	@JsonProperty (value ="nombre")
	private String nombre;

	@JsonProperty (value ="hospedado")
	private boolean hospedado;

	@JsonProperty (value ="vinculo")
	private String vinculo;


	public Cliente (@JsonProperty(value="id") Long pid,@JsonProperty(value="login")String pLogin, @JsonProperty(value="password")String pPass,
			@JsonProperty(value="nombre")String pnombre, @JsonProperty(value="hospedado")boolean pHospedado, @JsonProperty(value="vinculo")String pVinculo)
	{
		this.id = pid;
		this.login = pLogin;
		this.password = pPass;
		this.nombre = pnombre;
		this.hospedado = pHospedado;
		this.vinculo = pVinculo;
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

	public boolean isHospedado() {
		return hospedado;
	}

	public void setHospedado(boolean hospedado) {
		this.hospedado = hospedado;
	}

	public String getVinculo() {
		return vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}


}
