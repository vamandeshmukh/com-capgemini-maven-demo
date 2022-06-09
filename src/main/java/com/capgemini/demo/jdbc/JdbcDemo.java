package com.capgemini.demo.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

// jdbc demo to connect to Postgres DB 

public class JdbcDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String className = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/may12";
		String user = "postgres";
		String password = "root";
		String sql = "SELECT * FROM emps";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		System.out.println("Start");

		Class.forName(className);
		con = DriverManager.getConnection(url, user, password);

		st = con.createStatement();

		rs = st.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getString(2));
		}

//		System.out.println(rs.getFetchSize());

		con.close();

		System.out.println("End");

	}

}
