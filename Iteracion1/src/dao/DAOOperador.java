package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VOS.Apartamento;
import VOS.Cliente;
import VOS.Operador;

public class DAOOperador {

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
	public DAOOperador() {
		recursos = new ArrayList<Object>();
	}

	public void createOperador(Operador opera) throws SQLException
	{
		String sql = "INSERT INTO OPERADORES VALUES (";
		sql += opera.getId()+",";
		sql += "'"+ opera.getLogin()+"'";
		sql += "'"+opera.getPassword() +"',";
		sql +="'"+ opera.getNombre() +"',";
		int miembro =0;
		if (opera.isMiembro())
			miembro =1;
		sql += miembro +",";
		int registro =0;
		if (opera.isRegistro())
			registro =1;
		sql += registro +",";
		sql += "'"+ opera.getHoraApertura() +"',";
		sql += "'"+ opera.getHoraCierre() +"',";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();

	}

	public Operador convertResultSetToOperador(ResultSet resultSet) throws SQLException {
		Long id = resultSet.getLong("id_Usuario");
		String usuario = resultSet.getString("login");
		String password = resultSet.getString("password");
		String nombre = resultSet.getString("nombre");
		int miem = resultSet.getInt("miembro");
		boolean miembro = false ;
		if (miem ==1)
			miembro =true;
		int reg = resultSet.getInt("registro");
		boolean registro = false ;
		if (reg ==1)
			registro =true;
		double ganancias = resultSet.getDouble("ganancias");
		int telefono = resultSet.getInt("telefono");
		String tipo = resultSet.getString("tipoOperador");
		String apertura = resultSet.getString("HORADEAPERTURA");
		String cierre = resultSet.getString("HORADECIERRE");

		Operador cliente = new Operador (id, usuario, password, nombre, miembro, registro, ganancias, telefono, tipo, apertura, cierre);

		return cliente ;

	}
}
