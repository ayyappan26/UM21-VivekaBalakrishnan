package com.ultramain.um21.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ultramain.um21.connection.JavaSQL;
import com.ultranain.um21.dto.Empdto;

public class empDao1 {
	public void viewEmployees() throws SQLException{
	
	}

	public void registerEmployee(Empdto empDto) throws SQLException {
		Connection con = JavaSQL.getDbConnection();
		Statement st = con.createStatement();
//		String sql ="INSERT INTO emp VALUES("+ empDto.getEmployeeID()+"'"+ empDto.getFirstName() + "'"+
//					empDto.getLastName() + "'"+ empDto.getSalary() + "'" + empDto.getMobile() + "'" + 
//					empDto.getDepartment()+"')";
		
		String sql="Insert INTO emp  VALUES(?,?,?,?,?,?)";
				PreparedStatement pst= con.prepareStatement(sql);
		pst.setInt(1,empDto.getEmployeeID());
		pst.setString(2,empDto.getFirstName());
		pst.setString(3,empDto.getLastName());
		pst.setFloat(4,empDto.getSalary());
		pst.setInt(5,empDto.getMobile());
		pst.setString(6,empDto.getDepartment());
		
		
		int rowsUpdate = pst.executeUpdate(sql);
		

		System.out.println("Rows Update:" + rowsUpdate);
	}

}
