/**
 * 
 */
package com.bpi.training.jdbc_maven;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    // Database Credentials
	private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
	private static final String USER = "sdarnaiz";
	private static final String PASSWORD = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Connection connection = null;
         Statement statement = null;
         ResultSet resultSet = null;
         
     try {
    	 connection = DriverManager.getConnection(URL, USER, PASSWORD);
    	 System.out.println("Connected to PostgreSQL successfully");
    	 
    	 statement = connection.createStatement();
    	 
    	 String sql = "SELECT id, name, email FROM student";
    	 resultSet = statement.executeQuery(sql);
    	 
    	 while (resultSet.next()) {
    		 int id = resultSet.getInt("id");
    		 String name = resultSet.getString("name");
    		 String email = resultSet.getString("email");
    		 
    		 System.out.println(id + " | " + name + " | " + email );
    	 } 
     } catch (Exception e) {
    	  e.printStackTrace();
    	  
      } finally {
    	  try {
    		  resultSet.close();
    	  } catch (SQLException e) {
    		  e.printStackTrace();
    	 } 
    	  try {
    		  statement.close();
    	  } catch (SQLException e) {
    		  e.printStackTrace();
    	 } 
    	  try {
    		  connection.close();
    	  } catch (SQLException e) {
    		  e.printStackTrace();
    	 } 
     }
	}
}