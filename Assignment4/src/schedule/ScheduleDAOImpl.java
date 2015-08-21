package schedule;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;

import basic.BasicDAOImpl;
import demand.Demand;
import demand.DemandDAO;
import demand.DemandDAOImpl;

public class ScheduleDAOImpl extends BasicDAOImpl<Schedule> implements
	ScheduleDAO {

    @Override
    public Schedule getLogic(Session session, BigDecimal id) {
	return (Schedule) session.get(Schedule.class, id);
    }

    @Override
    public void setLogic(Session session, Schedule t) {
	session.saveOrUpdate(t);
    }

    @Override
    public List<Schedule> getManyLogic(Session session, String query) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void deleteLogic(Session session, Schedule t) {
	session.delete(t);

    }

    public static void main(String[] args) {
	ScheduleDAO dao = new ScheduleDAOImpl();
	/************* CREATE and UPDATE test code **********/
	Schedule schedule = new Schedule();
	schedule.setName("Sche.3");
	DemandDAO dao2 = new DemandDAOImpl();
	Demand demand = dao2.get(new BigDecimal(2058));
	dao.set(schedule);
	demand.setSchedule(schedule);
	dao2.set(demand);
	System.out.println(dao2.get(new BigDecimal(2058)).getSchedule());

	/************** GET test code *****************/
	// System.out.println(dao.get(new BigDecimal(2254)));

	/************** DELETE test code *************/
	// dao.delete(new Schedule().setScheId(new BigDecimal(2254)));

    }

}
