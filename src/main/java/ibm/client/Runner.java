package ibm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ibm.configuration.HibernateConfiguration;
import ibm.entity.Address;
import ibm.entity.Employee;
import ibm.entity.Student;

public class Runner {

	public static void main(String[] args) {
		Student obj = new Student(7, "Rahul", "male", "Noida");
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee e = new Employee();
		e.setFirstName("Abhi");
		e.setLastName("Kumar");
		Address add = new Address("marg", "Delhi");
		e.setAddress(add);
		add.setEmployee(e);
		session.persist(add);
		session.persist(e);
		tx.commit();
	}

}
