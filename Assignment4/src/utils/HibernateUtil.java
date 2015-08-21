package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory factory;

    static {
	Configuration cfg = new Configuration().configure();
	ServiceRegistry sr = new StandardServiceRegistryBuilder()
		.applySettings(cfg.getProperties()).build();
	factory = cfg.buildSessionFactory(sr);
    }

    public static SessionFactory getSessionFactory() {
	return factory;
    }

    public static Session getSession() {
	return factory.getCurrentSession();
    }

    public static void closeSession(Session session) {
	if (session != null) {
	    if (session.isOpen()) {
		session.close();
	    }
	}
    }
}