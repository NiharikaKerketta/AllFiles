package com.rmgyantra.testScript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class AddTheProjectFromDataBase {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		
		try {
		//register the database
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//establish the connection
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		
		//issue the statement
		Statement statement = connection.createStatement();
		String query = "insert into project(project_id, created_by,created_on, project_name, status, team_size) values ('TY_PROJ_007', 'Asha', '16/12/2021', 'tcs', 'Completed', '0')";
		String query1 = "insert into project(project_id, created_by,created_on, project_name, status, team_size) values ('TY_PROJ_008', 'Soha', '16/12/2021', 'wipro', 'On Going', '30')";
		//execute query
		int result = statement.executeUpdate(query);
		int result1 = statement.executeUpdate(query1);
		
		//verification
		if(result1==2) {
			System.out.println("One data is added into the database");
		}
		else {
			System.out.println("Data is not added into the database");
		}
	}
	catch (Exception e) {
		e.getStackTrace();
	}
		finally {
		//close the database connection
		connection.close();
		}
	}

}
