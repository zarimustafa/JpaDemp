package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class EmployeeFindService {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDemp");

		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();

		Employee e = manager.find(Employee.class, 200);

		System.out.println("ID - " + e.getId());
		System.out.println("Name - " + e.getName());
		System.out.println("Salary - " + e.getSal());
		System.out.println("Designation - " + e.getDes());

		manager.close();
		emf.close();

	}

}
