package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class EmployeeDeleteService {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaDemp");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Employee e = manager.find(Employee.class, 200);
		
		manager.remove(e);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
	}

}
