package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgMain {

	public static void main(String[] args) {
		
		String[][] emp = new String[10][2];
		for (byte b = 0; b < 10; b ++) {
			emp[b][0] = "Name " + b;
			emp[b][1] = "Surname " + b;
		}
		saveDataToEntity(emp); 
		
	}
	
	private static void saveDataToEntity(String[][] ent) {
		
		int empSize = ent.length;
		
		EmployeeEntity employee = new EmployeeEntity();
		
		for (byte b = 0; b < empSize; b ++) {
			
			employee.setEmployeeId(b);
			employee.setEmployeeName(ent[b][0]);
			employee.setEmployeeSurname(ent[b][1]);
			employee.setEmployeeAge(38+b);	
			
			saveEntityToDataBase(employee);
			
		}
		
	}
	private static void saveEntityToDataBase(Object ent) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();			
		session.save(ent);
		session.getTransaction().commit();
	}	
}
