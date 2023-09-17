package main;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "com.mysql.cj.jdbc.Driver";
		String db = "jdbc:mysql://localhost:3306/atmdb";
		String USER = "root";
		String PASS = "";

		try {
			Class.forName(url);
		Connection conn = DriverManager.getConnection(db,USER,PASS);
		Statement stmt = conn.createStatement();
		
		String query = "CREATE TABLE IF NOT EXISTS users (id INT NOT NULL AUTO_INCREMENT, nmae VARCHAR(255),email VARCHAR(255),PRIMARY KEY(id))";
		stmt.executeUpdate(query);
		
		stmt.close();
		conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}