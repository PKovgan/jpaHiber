package com.p.k;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.p.k.entity.Guide;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Query query = em.createQuery("select guide from Guide as guide");
		List<Guide> guides = query.getResultList();
		for (Guide guide : guides)  System.out.println(guide); 
		txn.commit();

	}

}
