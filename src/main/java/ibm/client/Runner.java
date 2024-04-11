package ibm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import ibm.entity.Student;

public class Runner {

	public static void main(String[] args) {
		Student obj = new Student(1,"Kunal","male","GZB");
//		Session session = new Configuration().configure().buildSessionFactory().openSession();
//		SessionFactory sf = cfg.buildSessionFactory();
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg1.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(obj);
		tx.commit();
	}

}
