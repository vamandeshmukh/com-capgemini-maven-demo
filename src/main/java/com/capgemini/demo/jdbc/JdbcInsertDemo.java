package com.capgemini.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class JdbcInsertDemo {

	public static void main(String[] args) {
		System.out.println("Start");

		String className = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/may12";
		String user = "postgres";
		String password = "root";
		String sql = "";

		Connection con = null;
		Statement st = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter eid:");
		int eid = sc.nextInt();
		System.out.println("Please enter first name:");
		String firstName = sc.next();
		System.out.println("Please enter salary:");
		double salary = sc.nextDouble();

		sql = "INSERT INTO emp (eid, first_name, salary) VALUES (" + eid + ", '" + firstName + "', " + salary + ");";
//		sql = "INSERT INTO emp (eid, first_name, salary) VALUES (50250, 'Sonali', 85000);";

		try {
			Class.forName(className);
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Record inerted cussessfully.");
			sc.close();
			st.close();
			con.close();

		} catch (SQLException | ClassNotFoundException cne) {
			System.out.println(cne.getMessage());

		}

		System.out.println("End");

	}

}
