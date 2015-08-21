package basic;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;

import utils.HibernateUtil;

public abstract class BasicDAOImpl<T> implements BasicDAO<T> {
    @Override
    public T get(BigDecimal id) {
	Session session = HibernateUtil.getSession();
	session.beginTransaction();
	T t = getLogic(session, id);
	session.getTransaction().commit();
	return t;
    }

    @Override
    public boolean set(T t) {
	Session session = HibernateUtil.getSession();
	session.beginTransaction();
	setLogic(session, t);
	session.getTransaction().commit();
	return true;
    }

    @Override
    public List<T> getMany(String query) {
	Session session = HibernateUtil.getSession();
	session.beginTransaction();
	List<T> list = getManyLogic(session, query);
	session.getTransaction().commit();
	return list;
    }

    @Override
    public boolean delete(T t) {
	Session session = HibernateUtil.getSession();
	session.beginTransaction();
	deleteLogic(session, t);
	session.getTransaction().commit();
	return true;
    }

    abstract public T getLogic(Session session, BigDecimal id);

    abstract public void setLogic(Session session, T t);

    abstract public List<T> getManyLogic(Session session, String query);

    abstract public void deleteLogic(Session session, T t);
}
