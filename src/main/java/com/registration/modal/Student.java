package com.registration.modal;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "player_Sequence")
    @SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	    
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "birthDate")
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "gender")
	private String gender;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "student_courses",
    joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
	private List<Courses> courses; 
	
	
	public List<Courses> getCourse() {
		return courses;
	}

	public void setCourse(List<Courses> course) {
		this.courses = course;
	}

	public Student() {
		
	}

	public Student(String name, String email, String userName, String password, Date birthDate, String nationality,
			String gender, List<Courses> courses) {
		super();
		this.name = name;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.birthDate = birthDate;
		this.nationality = nationality;
		this.gender = gender;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, email=%s, userName=%s, password=%s, birthDate=%s, gender=%s]",
				id, name, email, userName, password, birthDate, gender);
	}
	
}
