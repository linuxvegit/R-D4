package department;

public class DepartmentService {
    DepartmentDAO dao;

    public DepartmentService() {
	dao = new DepartmentDAOImpl();
    }

    public DepartmentService(DepartmentDAO dao) {
	this.dao = dao;
    }
}
