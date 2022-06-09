package com.capgemini.demo.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcJoinDemo {

	public static void main(String[] args) {

		String className = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/may12";
		String user = "postgres";
		String password = "root";
		String sql = "SELECT e.eid, e.first_name, e.salary, d.did, d.dname, d.city " + "FROM emps e "
				+ "LEFT JOIN deps d " + "ON e.did = d.did ORDER BY e.eid;";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		System.out.println("Start");
		try {

			Class.forName(className);
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery(sql);

			for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
				System.out.print(rs.getMetaData().getColumnLabel(i) + " \t");
			}
			System.out.println("\n");

			while (rs.next()) {
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					System.out.print(rs.getString(i) + " \t");
				}
				System.out.println("");
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
