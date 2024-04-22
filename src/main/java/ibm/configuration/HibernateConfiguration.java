package ibm.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
public class HibernateConfiguration {
	
	public static SessionFactory getSessionFactory()
	{
		Properties prop = new Properties();
		prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		prop.put(Environment.URL, "jdbc:mysql://localhost:3306/ducat");
		prop.put("hibernate.connection.username", "root");
		prop.put(Environment.PASS, "root");
		prop.put(Environment.SHOW_SQL, "true");
		prop.put(Environment.FORMAT_SQL, "true");
		prop.put(Environment.HBM2DDL_AUTO, "create");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(prop).build();
		MetadataSources meta = new MetadataSources(ssr);
		meta.addAnnotatedClassName("ibm.entity.Employee");
		meta.addAnnotatedClassName("ibm.entity.Address");
		return meta.buildMetadata().buildSessionFactory();
	}
}
