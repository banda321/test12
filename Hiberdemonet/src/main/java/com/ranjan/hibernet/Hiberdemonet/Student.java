package com.ranjan.hibernet.Hiberdemonet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
private int sid;
private String sname;

	
@OneToMany(mappedBy="student")
private List<Laptop> laptop=new ArrayList<Laptop>(); 

//private Laptop laptop;
public int getSid() {
	return sid;
	}
	 
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
	
	  public List <Laptop> getLaptop() { 
		  return laptop; 
		  } 
	  public void setLaptop(List<Laptop> laptop) { 
			  this.laptop = laptop;
			  }
	 
}
