package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VOS.Reserva;

public class DAOReserva {

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
	public DAOReserva() {
		recursos = new ArrayList<Object>();
	}
	
	
	
	
	public Reserva convertResultSetToReservar(ResultSet resultSet) throws SQLException {
		Long id= resultSet.getLong("ID_RESERVA");
		Date fechaInicio = resultSet.getDate("DIAINICIO");
		Date fechaFin = resultSet.getDate("DIAFINAL");
		double precio = resultSet.getDouble("PRECIOTOTAL");
		
		Reserva res = new Reserva (id,fechaInicio, fechaFin,precio);
		
		return res;
		
	}

}
