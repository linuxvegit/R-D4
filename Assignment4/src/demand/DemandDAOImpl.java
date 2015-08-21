package demand;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import post.Post;
import post.PostDAO;
import post.PostDaoImpl;
import basic.BasicDAOImpl;

public class DemandDAOImpl extends BasicDAOImpl<Demand> implements DemandDAO {

    @Override
    public Demand getLogic(Session session, BigDecimal id) {
	return (Demand) session.get(Demand.class, id);
    }

    @Override
    public void setLogic(Session session, Demand t) {
	session.saveOrUpdate(t);
    }

    @Override
    public List<Demand> getManyLogic(Session session, String query) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void deleteLogic(Session session, Demand t) {
	session.delete(t);
    }

    public static void main(String[] args) {
	DemandDAO dao = new DemandDAOImpl();

	/*************** CREATE and UPDATE test code *****************/
	Demand demand = new Demand();
	demand.setCreateDate(new Date());
	demand.setPost(new Post().setPostId(new BigDecimal(1470)));
	dao.set(demand);

	PostDAO dao2 = new PostDaoImpl();
	System.out.println(dao2.get(new BigDecimal(1470)));

	/**************** RETRIEVE test code ********************/
	// System.out.println(dao.get(new BigDecimal(1960)));

	/**************** DELETE test code ***********************/
	// dao.delete(new Demand().setDemId(new BigDecimal(1960)));
    }

}
