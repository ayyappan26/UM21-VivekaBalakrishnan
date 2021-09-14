package com.ultramain.um21.data;

import java.sql.SQLException;

import com.ultramain.um21.sql.EmpDao;

public class EmpMain {
	public static void main(String[] arg){
		EmpDao empDao = new EmpDao();
		try{
			empDao.viewEmployees();
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
	}

}
