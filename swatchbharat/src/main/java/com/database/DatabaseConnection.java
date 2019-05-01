package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
public Connection database() {

		

		Connection connection=null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1158/em","AchaAkshara","Akshara@2897");
			if(connection!=null)
			return connection;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	return connection;	

	}

public Connection getConnection() {
	
	return null;
}

}


