package ibm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ibm.configuration.HibernateConfiguration;
import ibm.entity.Student;

public class Runner {

	public static void main(String[] args) {
		Student obj = new Student(1,"Kunal","male","GZB");
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(obj);
		tx.commit();
	}

}
