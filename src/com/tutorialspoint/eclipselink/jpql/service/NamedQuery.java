package com.tutorialspoint.eclipselink.jpql.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorialspoint.eclipselink.entity.Employee;

public class NamedQuery {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaDemp");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createNamedQuery("find employee by id");
		
		query.setParameter("id", 201);
		Employee e = (Employee) query.getSingleResult();
		
		System.out.println(e);
		
		
	}

}
