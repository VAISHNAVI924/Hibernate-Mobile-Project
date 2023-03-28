package hello;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Helper {

	public static void main(String[] args) {
		Mobile m =new Mobile();
		m.setId(400);
		m.setName("redmi");
		m.setBrand("xiomi");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mobile");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(m);
		et.commit();

	}

}
