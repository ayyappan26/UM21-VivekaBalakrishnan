package com.ultramain.um21.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ultramain.um21.connection.JavaSQL;

public class EmpDao {
	public void viewEmployees() throws SQLException{
		Connection con = JavaSQL.getDbConnection();
		String sqlQuery ="Select * from emp";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);
		
		int employee_id;
		String first_name;
		String last_name;
		int salary;
		int mobile;
		String department;
		
		while(rs.next()){
			employee_id = rs.getInt(1);
			first_name = rs.getString(2);
			last_name = rs.getString(3);
			salary = rs.getInt(4);
			mobile = rs.getInt(5);
			department = rs.getString(6);
			
			System.out.println("Employee_ID  :" + employee_id);
			System.out.println("First_Name   :" + first_name);
			System.out.println("Last_Name    :" + last_name);
			System.out.println("Salary       :" + salary);
			System.out.println("Mobile       :" + mobile);
			System.out.println("Department   :" + department);
			System.out.println("--------------------------");
		}
		
	}

}