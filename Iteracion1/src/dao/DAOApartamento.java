package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VOS.Apartamento;

public class DAOApartamento{

	//----------------------------------------------------------------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Arraylits de recursos que se usan para la ejecucion de sentencias SQL
	 */
	private ArrayList<Object> recursos;

	/**
	 * Atributo que genera la conexion a la base de datos
	 */
	private Connection conn;

	//----------------------------------------------------------------------------------------------------------------------------------
	// METODOS DE INICIALIZACION
	//----------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Metodo constructor de la clase DAOBebedor <br/>
	 */
	public DAOApartamento() {
		recursos = new ArrayList<Object>();
	}
	
	public void createApto(Apartamento apto)
	{
		 String sql = "INSERT INTO Restaurante VALUES (";
		 sql += apto.getId()+",";
		 
		
	}
	
	
	public Apartamento convertResultSetToApartamento(ResultSet resultSet) throws SQLException {
		Long id = resultSet.getLong("id_Alojamiento");
		String ubicacion = resultSet.getString("ubicacion");
		double precio = resultSet.getDouble("precio");
		int maxPersonas = resultSet.getInt("maxPersonas");
		int dispo = resultSet.getInt("disponibilidad");
		boolean disponibilidad = false ;
				if (dispo ==1)
					disponibilidad =true;
		int diasCancelacion = resultSet.getInt("diasCancelacion");
		int amo = resultSet.getInt("amoblado");
		boolean amoblado = false ;
				if (amo ==1)
					amoblado=true;
		
		Apartamento apto = new Apartamento (id, disponibilidad,maxPersonas, ubicacion, precio, diasCancelacion, amoblado );
		
		return apto ;
		
		
	}

}
