package org.tnsif.unidirectional;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class OneToOneUnidirectionalDemo {

		public static void main(String[] args) {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em=factory.createEntityManager();
			em.getTransaction().begin();
			
			Employee emp1=new Employee();
			emp1.setEmpname("Shital Salve");
			
			Employee emp2=new Employee();
			emp2.setEmpname("Vaibhav Karkute");
			
			Address a1=new Address();
			a1.setPincode(400101);
			a1.setCity("Nagpur");
			a1.setArea("Ganeshpeth");
			a1.setState("Maharashtra");
			
			Address a2=new Address();
			a1.setPincode(411014);
			a1.setCity("Mumbai");
			a1.setArea("Airoli");
			a1.setState("Maharashtra");
			
			emp2.setAddress(a1);
			emp1.setAddress(a2);
			
			em.persist(emp1);
			em.persist(emp2);
			em.getTransaction().commit();
			System.out.println("Data added successfully");
			em.close();
			factory.close();
			
			}

	}

}
