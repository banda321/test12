package com.ranjan.hibernet.Hiberdemonet;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;

@Entity
@Cacheable
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_ONLY)
public class Member {
	@Id
	int id;
	String name;
	String color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	

}
