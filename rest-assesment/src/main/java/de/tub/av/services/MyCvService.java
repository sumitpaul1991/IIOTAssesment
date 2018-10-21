package de.tub.av.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.tub.av.models.MyCV;

import de.tub.av.repos.MyCVRepo;




@Service
public class MyCvService {
	
	@Autowired
	private MyCVRepo myCvRepo;
	
	public List<MyCV> getCVs(){
		List<MyCV>allCV = new ArrayList<>();
		myCvRepo.findAll()
		.forEach(allCV::add);
		
		return allCV;
	}
	
	public MyCV getCVById(int id) {
		return myCvRepo.findOne(id);
			
	}
	
	public String addName(MyCV name){
		myCvRepo.save(name);
		return "Successfull";
	}
	public MyCV getEmails(int id){
		return myCvRepo.findOne(id);
	}
	public String addEmail(MyCV email){
		myCvRepo.save(email);
		return "Successfull";
	}
	public MyCV getMtknr(int id){
		return myCvRepo.findOne(id);
	}
	public String addMtknr(MyCV id){
		myCvRepo.save(id);
		return "Successfull";
		
	}
	public MyCV getCourseOfStudies(int id){
		return myCvRepo.findOne(id);
	}
	public String addCourseOfStudies(MyCV courseOfStudies){
		myCvRepo.save(courseOfStudies);
		return "Successfull";
	}
	public MyCV getBackGround(int id){
		return myCvRepo.findOne(id);
	}
	public String addBackGround(MyCV backGround){
		myCvRepo.save(backGround);
		return "Successfull";
	}
	public MyCV getSkills(int id){
		return myCvRepo.findOne(id);
	}
	public String addSkills(MyCV skills){
		myCvRepo.save(skills);
		return "Successfull";
	}
	public MyCV getTopic(int id){
		return myCvRepo.findOne(id);
	}
	public String addTopic(MyCV topic){
		myCvRepo.save(topic);
		return "Successfull";
	}
	
	
	
	public String deleteCV(int id) {
			myCvRepo.delete(id);
			return "Successfully Deleted";
		
	}

	
		

}
