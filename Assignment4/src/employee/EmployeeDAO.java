package employee;

import basic.BasicDAO;

public interface EmployeeDAO extends BasicDAO<Employee> {
    public Employee getByPhone(String phone);
}
