package com.fets.ibedc.dw.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.fets.ibedc.dw.jersey.responses.Data;
import com.fets.ibedc.dw.util.Env;
import com.miola.tms.dto.CashOfficeDto;


public class DataBaseService {

	Connection con;
	Statement stat;
	ResultSet result;
	String empty = "";

	CallableStatement stored_procedure;
	
	String from = "";
	String[] to = new String[1];

	public DataBaseService() {

	}

	public void connectDB() throws SQLException {
		closeConnection();

		con = Env.getDWConnection();
	}

	public void closeConnection() {
		if (result != null) {
			try {
				result.close();
				result = null;
			} catch (Exception ex) {
			}
		}
		if (con != null) {
			try {
				con.close();
				con = null;
			} catch (Exception e) {
			}
		}
	}

	
	public void connectIBEDCDB() throws SQLException {
		closeIBEDCConnection();

		con = Env.getDWConnection();
	}

	public void closeIBEDCConnection() {
		if (result != null) {
			try {
				result.close();
				result = null;
			} catch (Exception ex) {
			}
		}
		if (con != null) {
			try {
				con.close();
				con = null;
			} catch (Exception e) {
			}
		}
	}
	
	
	
	public Vector<Data> getData() {
		Vector<Data> list = new Vector<Data>();

		try {
			connectDB();

			stored_procedure = con.prepareCall("{call get_data_sp ()}");

			result = stored_procedure.executeQuery();

			while (result.next()) {

				Data e = new Data(result.getString(1), result.getString(2), result.getString(3), result.getString(4),
						result.getString(5), result.getString(6));
				list.add(e);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			closeConnection();

		} finally {
			closeConnection();
		}
		return list;

	}
	
	
	public void closeData() {
		
		try {
			connectDB();

			stored_procedure = con.prepareCall("{call close_data()}");

			stored_procedure.execute();

			
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				con.rollback();
			} catch (Exception e) {
			}
			closeConnection();
			
		} finally {
			closeConnection();
		}

		
	}


	
	public int getLastID() {
		int id = 0;

		try {
			connectDB();

			stored_procedure = con.prepareCall("{call get_last_ibedc_id_sp ()}");

			result = stored_procedure.executeQuery();

			while (result.next()) {

				id = result.getInt(1);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			closeConnection();

		} finally {
			closeConnection();
		}
		return id;

	}
	
	
	
public void saveLastId(int id) {
		
		try {
			connectDB();

			stored_procedure = con.prepareCall("{call save_ibedc_id(?)}");
			stored_procedure.setInt(1, id);
			stored_procedure.execute();

			
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				con.rollback();
			} catch (Exception e) {
			}
			closeConnection();
			
		} finally {
			closeConnection();
		}

		
	}



 public int saveData(int id) {
		
		try {
			connectDB();

			stored_procedure = con.prepareCall("{call save_ibedc_data(?)}");
			stored_procedure.setInt(1, id);
			stored_procedure.registerOutParameter(1, java.sql.Types.INTEGER);
			stored_procedure.execute();
			
			id = stored_procedure.getInt(1);

			
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				con.rollback();
			} catch (Exception e) {
			}
			closeConnection();
			
		} finally {
			closeConnection();
		}

		return id;
	}




}
