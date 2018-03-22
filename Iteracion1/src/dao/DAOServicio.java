package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VOS.Operador;
import VOS.Servicio;

public class DAOServicio {

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
	public DAOServicio() {
		recursos = new ArrayList<Object>();
	}
	
	public void createServicio(Servicio serv, Long idAloja) throws SQLException
	{
		String sql = "INSERT INTO SERVICIO VALUES (";
		sql += serv.getId()+",";
		sql +=  serv.getCosto()+",";
		sql += "'"+serv.getNombre() +"',";
		sql+= idAloja+ ",";
		
		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();

	}


	public Servicio convertResultSetToServicio(ResultSet resultSet) throws SQLException {

		Long id = resultSet.getLong("ID_SERVICIO");
		double costo = resultSet.getDouble("COSTO");
		String nombre = resultSet.getString("NOMBRE");
		
		Servicio serv = new Servicio (id,costo,nombre);
		
		return serv;
	}

}
