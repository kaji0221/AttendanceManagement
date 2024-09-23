package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static final String URL = "jdbc:mysql://localhost:3306/attendance_db";
	private static final String USER = "root";
	private static final String PASSWORD = "password";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		return DriverManager.getConnection(URL, USER, PASSWORD);

	}
}
