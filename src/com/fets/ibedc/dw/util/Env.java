
package com.fets.ibedc.dw.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * Resource object for retrieving database connections from the configurations of the web server through JNDI.
 * 
 * 
 * Created 14 - 01 - 07
 * @author Seye Cole
 * */
public class Env
{
	/**
	 * Statis varaible for getting context configurations.
	 * Used by all methods to retrieve the environment context.
	 * */
	private static Context initCtx;
	private static Context envCtx;
	
	
	/*private static String url ="jdbc:mysql://172.16.0.2:3306/brickms";
	private static String url_refdb = "jdbc:mysql://172.16.0.2:3306/brick_ref";
	private static String username = "harvey";
	private static String pwd = "1w2w1s";
	*/
	
	/*
	 * Static block for context environment connection.
	 * */
	static
	{
		try
		{
			initCtx = new InitialContext();
			envCtx = (Context)initCtx.lookup("java:comp/env");
		}
		catch(Exception ex)
		{
			System.out.println("Error initailizing the context environment...");
			ex.printStackTrace();
		}
	}
	
	//for braLaw
	/**
	 * Gets connection to the 'braLaw' database on server 'SANTIAGO'.
	 * Uses a dsn-less mode of connection. [requires no odbc datasource]
	 * @return java.sql.Connection
	 * */
	public static Connection getIBEDCConnection(){
		try
		{
			DataSource ds = (DataSource)envCtx.lookup("jdbc/IBEDC");
			Connection con = ds.getConnection();
			con.setAutoCommit(false);
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			
			/*Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection(url,username,pwd);
			con.setAutoCommit(false);
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);*/
			return con;
		}
		catch(Exception ex)
		{
			System.out.println("Error retrieving the data source from the context...");
			ex.printStackTrace();
			return  reconnect_IBEDC();
		}  
	}
	
	/**
	 * Reconnects the connection object to the database.
	 * */
	public static Connection reconnect_IBEDC()
	{
		try
		{
			DataSource ds = (DataSource)envCtx.lookup("jdbc/IBEDC");
			Connection con = ds.getConnection();
			con.setAutoCommit(false);
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			
			/*Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection(url,username,pwd);
			con.setAutoCommit(false);
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);*/
			
			return con;
		}
		catch(Exception ex)
		{
			System.out.println("Error retrieving the data source from the context...");
			ex.printStackTrace();
			return null;
		}
	}
	
	
	public static Connection getDWConnection(){
		try
		{
			DataSource ds = (DataSource)envCtx.lookup("jdbc/DW");
			Connection con = ds.getConnection();
			con.setAutoCommit(false);
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			
			/*Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection(url,username,pwd);
			con.setAutoCommit(false);
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);*/
			return con;
		}
		catch(Exception ex)
		{
			System.out.println("Error retrieving the data source from the context...");
			ex.printStackTrace();
			return  reconnect_DW();
		}  
	}
	
	/**
	 * Reconnects the connection object to the database.
	 * */
	public static Connection reconnect_DW()
	{
		try
		{
			DataSource ds = (DataSource)envCtx.lookup("jdbc/DW");
			Connection con = ds.getConnection();
			con.setAutoCommit(false);
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			
			/*Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection(url,username,pwd);
			con.setAutoCommit(false);
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);*/
			
			return con;
		}
		catch(Exception ex)
		{
			System.out.println("Error retrieving the data source from the context...");
			ex.printStackTrace();
			return null;
		}
	}
}
