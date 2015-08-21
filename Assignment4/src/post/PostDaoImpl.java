package post;

import java.math.BigDecimal;
import java.util.List;

import oracle.net.aso.e;

import org.hibernate.Session;

import basic.BasicDAOImpl;
import demand.Demand;
import department.Department;
import department.DepartmentDAO;
import department.DepartmentDAOImpl;
import employee.Employee;

public class PostDaoImpl extends BasicDAOImpl<Post> implements PostDAO {

    @Override
    public Post getLogic(Session session, BigDecimal id) {
	return (Post) session.get(Post.class, id);
    }

    @Override
    public void setLogic(Session session, Post t) {
	session.saveOrUpdate(t);
    }

    @Override
    public List<Post> getManyLogic(Session session, String query) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void deleteLogic(Session session, Post t) {
	session.delete(t);
    }

    public static void main(String[] args) {
	PostDAO dao = new PostDaoImpl();

	/************* CREATE and UPDATE test code **************/
	Department department = new Department();
	department.setDeptId(new BigDecimal(196));
	Post post = new Post();
	post.setName("post.4");
	post.setDepartment(department);
	dao.set(post);
	DepartmentDAO dao2 = new DepartmentDAOImpl();
	System.out.println(dao2.get(new BigDecimal(196)));
    }

}
