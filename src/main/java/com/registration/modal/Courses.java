package com.registration.modal;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_Sequence")
	@SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	private int courseId;

	@Column(name = "courseName")
	private String courseName;

	@Column(name = "description")
	private String description;

	@Column(name = "publishDate")
	private String publishDate;

	@Column(name = "lastUpdated")
	private String lastUpdated;

	@Column(name = "totalHours")
	private String totalHours;

	@Column(name = "instructor")
	private String instructor;
	
	@ManyToMany(targetEntity=Student.class, mappedBy="userName", fetch=FetchType.EAGER)
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Courses() {

	}

	public Courses(String courseName, String description, String publishDate, String lastUpdated, String totalHours,
			String instructor) {
		super();
		this.courseName = courseName;
		this.description = description;
		this.publishDate = publishDate;
		this.lastUpdated = lastUpdated;
		this.totalHours = totalHours;
		this.instructor = instructor;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
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

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
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
				courseId, courseName, description, publishDate, lastUpdated, totalHours, instructor);
	}

}
