package employee;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;

import utils.HibernateUtil;
import basic.BasicDAOImpl;

public class EmployeeDAOImpl extends BasicDAOImpl<Employee> implements
	EmployeeDAO {

    @Override
    public Employee getLogic(Session session, BigDecimal id) {
	return (Employee) session.get(Employee.class, id);
    }

    @Override
    public void setLogic(Session session, Employee t) {
	session.saveOrUpdate(t);
    }

    @Override
    public List<Employee> getManyLogic(Session session, String query) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void deleteLogic(Session session, Employee t) {
	session.delete(t);
    }

    @Override
    public Employee getByPhone(String phone) {
	Session session = HibernateUtil.getSession();
	session.beginTransaction();
	Employee employee = getByPhoneLogic(session, phone);
	session.getTransaction().commit();
	return employee;

    }

    public Employee getByPhoneLogic(Session session, String phone) {
	return null;
    }

    public static void main(String[] args) {
	EmployeeDAO dao = new EmployeeDAOImpl();
	/************ CREATE and UPDATE test code ***********/
	// Employee employee = new Employee();
	// employee.setPhone("15988382930").setName("Eaman").setGender(false)
	// .setBirthday(new Date(11111111)).setNation("Yamata")
	// .setMarriage(true).setAddress("Tokyo").setHabit("Work")
	// .setHealth("Normal").setEmpId(new BigDecimal(490));
	// employee.setPost(new Post().setPostId(new BigDecimal(1470)));
	// dao.set(employee);
	// PostDAO dao2 = new PostDaoImpl();
	// System.out.println(dao2.get(new BigDecimal(1470)));

	/************** RETRIEVE test code ****************/
	// System.out.println(dao.get(new BigDecimal(588)));

	/************** DELETE test code *****************/
	dao.delete(new Employee().setEmpId(new BigDecimal(588)));

    }

}
