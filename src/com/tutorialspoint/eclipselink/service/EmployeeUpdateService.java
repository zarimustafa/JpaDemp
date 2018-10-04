package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class EmployeeUpdateService {

	public static void main(String[] args) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDemp");
		
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		Employee e = manager.find(Employee.class, 200);
		
		e.setName("Mustafa");
		e.setSal(39393);
		manager.persist(e);
		manager.getTransaction().commit();
		
		System.out.println(e);
		
		manager.close();
		emf.close();
		

	}

}
