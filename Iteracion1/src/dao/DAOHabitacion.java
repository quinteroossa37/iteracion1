package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VOS.Habitacion;

public class DAOHabitacion  {

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
	public DAOHabitacion() {
		recursos = new ArrayList<Object>();
	}
	
	
	public Habitacion convertResultSetToHabitacion(ResultSet resultSet) throws SQLException {
		Long id = resultSet.getLong("id_Alojamiento");
		String ubicacion = resultSet.getString("ubicacion");
		double precio = resultSet.getDouble("precio");
		int maxPersonas = resultSet.getInt("maxPersonas");
		int dispo = resultSet.getInt("disponibilidad");
		boolean disponibilidad = false ;
				if (dispo ==1)
					disponibilidad =true;
		int diasCancelacion = resultSet.getInt("diasCancelacion");
		int minNoches = resultSet.getInt("minNoches");
		String tipo = resultSet.getString("tipo");
		
		Habitacion habitacion = new Habitacion (id, disponibilidad,maxPersonas, ubicacion, precio, diasCancelacion, minNoches, tipo );
		
		return habitacion ;
		
		
	}


}
