package post;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import utils.HibernateUtil;

public class PostDaoImpl implements PostDAO {

    @Override
    public Post get(BigDecimal id) {
	Session session = HibernateUtil.getSession();
	session.beginTransaction();

	Post post = (Post) session.get(Post.class, id);

	session.getTransaction().commit();
	return post;
    }

    @Override
    public boolean set(Post t) {
	Session session = HibernateUtil.getSession();
	session.beginTransaction();

	session.saveOrUpdate(t);

	session.getTransaction().commit();
	return true;
    }

    @Override
    public List<Post> getMany(String query) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public boolean delete(Post t) {
	// TODO Auto-generated method stub
	return false;
    }

    public static void main(String[] args) {
	PostDAO dao = new PostDaoImpl();
	System.out.println(dao.get(new BigDecimal(1274)));
    }

}
