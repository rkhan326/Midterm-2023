package math.problems;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class LowestNumber {
	public static void main(String[] args) throws SQLException {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

		int lowest = LowestNumber.findLowest(array);

		databases.ConnectToSqlDB connectToSqlDB = new databases.ConnectToSqlDB();
		Connection connection = null;
		try {
			connection = ConnectToSqlDB.connectToSqlDatabase();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
			String query = " insert into lowest (lowestValue)"
					+ " values (?)";
			assert null != connection;
			PreparedStatement preparedStmt = connection.prepareStatement(query);
			preparedStmt.setInt(1, lowest);

			preparedStmt.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}


		Statement stmt = null;
		try {
			assert connection != null;
			stmt = connection.createStatement();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		ResultSet rs = null;
		try {
			assert stmt != null;
			rs = stmt.executeQuery("select * from lowest");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		while (true) {
			assert rs != null;
			if (!rs.next()) break;
			try {
				System.out.println(rs.getInt(1));
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		try {
			connection.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}

	}

	public static int findLowest(int[] array) {
		int lowest = array[0];
		for (int j : array) {
			if (lowest > j) {
				lowest = j;
			}
		}
		return lowest;
	}


}