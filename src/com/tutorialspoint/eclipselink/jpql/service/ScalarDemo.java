package com.tutorialspoint.eclipselink.jpql.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorialspoint.eclipselink.entity.Employee;

public class ScalarDemo {

	public static void main(String[] args) {

			EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaDemp");
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			
			Query query = manager.createQuery("Select UPPER(e.name) from Employee e");
			List<String> result = query.getResultList();
			result.stream().forEach(System.out::println);
			
			query = manager.createQuery("Select e.sal from Employee e where e.id = 200");
			double e =(double) query.getSingleResult();
			
			System.out.println(e);
			
			
	}

}
