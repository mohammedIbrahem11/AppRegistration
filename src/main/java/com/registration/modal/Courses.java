package com.registration.modal;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_Sequence")
	@SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	private String id;

	@Column(name = "courseName")
	private String courseName;

	@Column(name = "description")
	private String description;

	@Column(name = "publishDate")
	@Temporal(TemporalType.DATE)
	private Date publishDate;

	@Column(name = "lastUpdated")
	@Temporal(TemporalType.DATE)
	private Date lastUpdated;

	@Column(name = "totalHours")
	private String totalHours;

	@Column(name = "instructor")
	private String instructor;
	
	@ManyToMany(mappedBy="courses")
	private List<Student> students;

	public List<Student> getStudents() {
		return students; 
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Courses() {

	}

	public Courses(String courseName, String description, Date publishDate, Date lastUpdated, String totalHours,
			String instructor) {
		super();
		this.courseName = courseName;
		this.description = description;
		this.publishDate = publishDate;
		this.lastUpdated = lastUpdated;
		this.totalHours = totalHours;
		this.instructor = instructor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(String totalHours) {
		this.totalHours = totalHours;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return String.format(
				"courses [courseId=%s, courseName=%s, description=%s, publishDate=%s, lastUpdated=%s, totalHours=%s, instructor=%s]",
				id, courseName, description, publishDate, lastUpdated, totalHours, instructor);
	}

}
