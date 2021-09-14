package com.ultramain.um21.business;

import java.sql.SQLException;
import java.util.Scanner;

import com.ultramain.um21.sql.EmpDao;
import com.ultramain.um21.sql.Scan;
import com.ultramain.um21.sql.empDao1;
import com.ultranain.um21.dto.Empdto;

public class EmployeeBO {
	public void empSystem(){
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		empDao1 dao = new empDao1();
		do{
			System.out.println("1. View Employee");
			System.out.println("2. Register Employee");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			choice = scan.nextInt();
		}while(choice<0);
		
		switch(choice){
			case 1:
				viewEmployees(dao);
				break;
			case 2:
				registerEmployee(dao);
				break;
			case 3:
				return;
				
			}
	}
	public void viewEmployees(empDao1 dao) {
		try{
			dao.viewEmployees();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	public void registerEmployee(empDao1 dao) {
		Empdto empDto = getEmpDetails();	
		try {
			dao.registerEmployee(empDto);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private Empdto getEmpDetails(){
		Scanner scan = Scan.getScannerInstance();
		Empdto empDto = new Empdto();
		System.out.println("Enter Employee ID:  ");
		empDto.setEmployeeID(scan.nextInt());
		System.out.println("Enter First Name:  ");
		empDto.setFirstName(scan.next());
		System.out.println("Enter Last Name:  ");
		empDto.setLastName(scan.next());
		System.out.println("Enter Salary:  ");
		empDto.setSalary(scan.nextInt());
		System.out.println("Enter Mobile:  ");
		empDto.setMobile(scan.nextInt());
		System.out.println("Enter Department:  ");
		empDto.setDepartment(scan.next());
		return empDto;
	
	}
	
}