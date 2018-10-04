package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class EmployeeAddService {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDemp");
		
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		Employee e1 = new Employee();
		e1.setId(201);
		e1.setName("Vimal");
		e1.setSal(300000);
		e1.setDes("dev");
		
		manager.persist(e1);
		manager.getTransaction().commit();
		
		manager.close();
		emf.close();
		
	}

}
