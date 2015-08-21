package applicant;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;

import basic.BasicDAOImpl;

public class ApplicantDAOImpl extends BasicDAOImpl<Applicant> implements
	ApplicantDAO {

    @Override
    public Applicant getLogic(Session session, BigDecimal id) {
	return (Applicant) session.get(Applicant.class, id);
    }

    @Override
    public void setLogic(Session session, Applicant t) {
	session.saveOrUpdate(t);
    }

    @Override
    public List<Applicant> getManyLogic(Session session, String query) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void deleteLogic(Session session, Applicant t) {
	session.delete(t);
    }

    public static void main(String[] args) {
	ApplicantDAO dao = new ApplicantDAOImpl();
	/************ CREATE and UPDATE test code *********/
	// Applicant applicant = new Applicant();
	// applicant.setPhone("14432141234").setName("applic").setGender(true)
	// .setBirthday(new Date()).setNation("USA").setMarriage(false)
	// .setAddress("Beijing").setHabit("TV").setHealth("Great");
	// applicant.setDemand(new Demand().setDemId(new BigDecimal(2058)));
	// dao.set(applicant);
	// DemandDAO dao2 = new DemandDAOImpl();
	// System.out.println(dao2.get(new BigDecimal(2058)));

	/************** RETRIEVE test code *************/
	// System.out.println(dao.get(new BigDecimal(784)));

	/*************** DELETE test code ************/
	dao.delete(new Applicant().setAppId(new BigDecimal(784)));
    }

}
