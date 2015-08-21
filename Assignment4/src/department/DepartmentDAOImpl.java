package department;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;

import post.Post;

import basic.BasicDAO;
import basic.BasicDAOImpl;

public class DepartmentDAOImpl extends BasicDAOImpl<Department> implements
	DepartmentDAO {

    @Override
    public Department getLogic(Session session, BigDecimal id) {
	return (Department) session.get(Department.class, id);
    }

    @Override
    public void setLogic(Session session, Department t) {
	session.saveOrUpdate(t);
    }

    @Override
    public List<Department> getManyLogic(Session session, String query) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void deleteLogic(Session session, Department t) {
	session.delete(t);
    }

    public static void main(String[] args) {
	Department department = new Department();
	department.setDeptId(new BigDecimal(294));

	BasicDAO<Department> dao = new DepartmentDAOImpl();

	department = dao.get(new BigDecimal(196));
	System.out.println(department);

    }

}
