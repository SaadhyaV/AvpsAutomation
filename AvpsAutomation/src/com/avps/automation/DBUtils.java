package com.avps.automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBUtils {
	private Connection conn;
	private ResultSet rs;

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost/drivinglicenseapp";
		String user = "root";
		String pass = "Kanha@2527";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("connection established!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		new DBUtils().getConnection();
	}

}
