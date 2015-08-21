package demand;

// Generated 2015-8-20 14:27:22 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import applicant.Applicant;

import post.Post;
import schedule.Schedule;

import department.Department;

/**
 * Demand generated by hbm2java
 */
public class Demand implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4371152728660248979L;
    private BigDecimal demId;
    private Schedule schedule;
    private Post post;
    private Date createDate;
    private BigDecimal people;
    private String degree;
    private String exp;
    private String major;
    private BigDecimal wage;
    private Date startDate;
    private Date endDate;
    private BigDecimal completed = new BigDecimal(0);
    private Set<Applicant> applicants = new HashSet<Applicant>(0);

    public Demand() {
    }

    public Demand(BigDecimal demId, Department department, Schedule schedule,
	    Post post, Date createDate) {
	this.demId = demId;
	this.schedule = schedule;
	this.post = post;
	this.createDate = createDate;
    }

    public Demand(BigDecimal demId, Department department, Schedule schedule,
	    Post post, Date createDate, BigDecimal people, String degree,
	    String exp, String major, BigDecimal wage, Date startDate,
	    Date endDate, BigDecimal completed, Set<Applicant> applicants) {
	this.demId = demId;
	this.schedule = schedule;
	this.post = post;
	this.createDate = createDate;
	this.people = people;
	this.degree = degree;
	this.exp = exp;
	this.major = major;
	this.wage = wage;
	this.startDate = startDate;
	this.endDate = endDate;
	this.completed = completed;
	this.applicants = applicants;
    }

    public BigDecimal getDemId() {
	return this.demId;
    }

    public Demand setDemId(BigDecimal demId) {
	this.demId = demId;
	return this;
    }

    public Schedule getSchedule() {
	return this.schedule;
    }

    public Demand setSchedule(Schedule schedule) {
	this.schedule = schedule;
	return this;
    }

    public Post getPost() {
	return this.post;
    }

    public Demand setPost(Post post) {
	this.post = post;
	return this;
    }

    public Date getCreateDate() {
	return this.createDate;
    }

    public Demand setCreateDate(Date createDate) {
	this.createDate = createDate;
	return this;
    }

    public BigDecimal getPeople() {
	return this.people;
    }

    public Demand setPeople(BigDecimal people) {
	this.people = people;
	return this;
    }

    public String getDegree() {
	return this.degree;
    }

    public Demand setDegree(String degree) {
	this.degree = degree;
	return this;
    }

    public String getExp() {
	return this.exp;
    }

    public Demand setExp(String exp) {
	this.exp = exp;
	return this;
    }

    public String getMajor() {
	return this.major;
    }

    public Demand setMajor(String major) {
	this.major = major;
	return this;
    }

    public BigDecimal getWage() {
	return this.wage;
    }

    public Demand setWage(BigDecimal wage) {
	this.wage = wage;
	return this;
    }

    public Date getStartDate() {
	return this.startDate;
    }

    public Demand setStartDate(Date startDate) {
	this.startDate = startDate;
	return this;
    }

    public Date getEndDate() {
	return this.endDate;
    }

    public Demand setEndDate(Date endDate) {
	this.endDate = endDate;
	return this;
    }

    public BigDecimal getCompleted() {
	return this.completed;
    }

    public Demand setCompleted(BigDecimal completed) {
	this.completed = completed;
	return this;
    }

    public Set<Applicant> getApplicants() {
	return this.applicants;
    }

    public Demand addApplicant(Applicant applicant) {
	if (applicant == null)
	    return this;
	if (!applicant.getDemand().equals(this)) {
	    applicant.getDemand().getApplicants().remove(applicant);
	}
	applicant.setDemand(this);
	this.applicants.add(applicant);
	return this;
    }

    public Demand setApplicants(Set<Applicant> applicants) {
	this.applicants = applicants;
	return this;
    }

    @Override
    public String toString() {
	return "Demand [demId=" + demId + ", createDate=" + createDate
		+ ", people=" + people + ", degree=" + degree + ", exp=" + exp
		+ ", major=" + major + ", wage=" + wage + ", startDate="
		+ startDate + ", endDate=" + endDate + ", completed="
		+ completed + ", applicants=" + applicants + "]";
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!(obj instanceof Demand))
	    return false;

	final Demand demand = (Demand) obj;

	if (!demand.getCreateDate().equals(createDate))
	    return false;

	return true;
    }

    @Override
    public int hashCode() {
	return createDate.hashCode();
    }

}