package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VOS.Cliente;
import VOS.Operador;

public class DAOCliente {

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
	public DAOCliente() {
		recursos = new ArrayList<Object>();
	}
	
	public void createCliente(Cliente cliente) throws SQLException
	{
		String sql = "INSERT INTO CLIENTE VALUES (";
		sql += cliente.getId()+",";
		sql += "'"+ cliente.getLogin()+"'";
		sql += "'"+cliente.getPassword() +"',";
		sql +="'"+ cliente.getNombre() +"',";
		sql +="'"+ cliente.getVinculo() +"',";
		int hospe =0;
		if (cliente.isHospedado())
			hospe =1;
		sql += hospe +",";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();

	}
	
	
	
	public Cliente convertResultSetToCliente(ResultSet resultSet) throws SQLException {
		Long id = resultSet.getLong("idCLIENTE");
		String usuario = resultSet.getString("login");
		String password = resultSet.getString("password");
		String nombre = resultSet.getString("nombre");
		int hospe = resultSet.getInt("hospedado");
		boolean hospedado = false ;
				if (hospe ==1)
					hospedado =true;
		String vinculo = resultSet.getString("vinculo");
		
		Cliente cliente = new Cliente (id, usuario, password, nombre, hospedado, vinculo);
		
		return cliente ;
		
		
	}
}
