package com.capgemini.demo.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

// jdbc demo to connect to Postgres DB 
// if your PG admin is open, 
// run commit;

public class JdbcDemo {

	public static void main(String[] args) {

		String className = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/may12";
		String user = "postgres";
		String password = "root";
		String sql = "SELECT * FROM emps";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		System.out.println("Start");
		try {

			Class.forName(className);
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				int index = 1;
				for (int i = 1; i <= rs.getFetchSize(); i++) {
					System.out.print(rs.getString(index) + " \t");
					index++;
				}
				System.out.println("\n");
			}
			rs.close();
			st.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
