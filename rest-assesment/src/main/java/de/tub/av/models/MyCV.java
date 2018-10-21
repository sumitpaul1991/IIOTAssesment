package de.tub.av.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyCV {
	
	@Id
    @GeneratedValue
    private int id;
	
    private String name;
	
	private String email;
	
	private String courseOfStudies ;
	
	private String backGround;
	
	private String skills;
	
	private String topic;
	
	
	
	public MyCV() {
		
	}
	
	public MyCV(String name,int id, String email, String courseOfStudies, String backGround, String skills, String topic) {
		
		name = "Sumit Paul";
		email= "sumit.paul@campus.tu-berlin.de";
		courseOfStudies = "Computer Science";
		backGround = "IIOT, Digital Communities, Mobile Services, Smart Communication System";
		skills = "Coding knowledge with Java, JS";
		topic= "Realization and testing of IoT appiication using ElasTest, "
				+ "Develop and implement an algorithm for performance evaluation of Service-placement in Edge computing" 
				+ "Test Open Baton with ElasTest";
		id =387580;
		
	}

	public long getId() {
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

	public  String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.name = email;
	}
	public  String getCourseOfStudies() {
		return courseOfStudies;
	}
	public void setCourseOfStudies(String courseOfStudies) {
		this.courseOfStudies = courseOfStudies;
	}
	
	public  String getBackGround() {
		return backGround;
	}
	public void setBackGround(String backGround) {
		this.backGround = backGround;
	}
	
	public  String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	public  String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}





	
	
}
