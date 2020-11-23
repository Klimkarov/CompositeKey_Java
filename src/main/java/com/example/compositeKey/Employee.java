package com.example.compositeKey;

import javax.persistence.Column;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "EMPLOYEE")
public class Employee {         

	@EmbeddedId
	private CompositeId id; 
	
	@Column(name = "name")
	private String name;
	
	public Employee() {
		
	}

	public Employee(CompositeId id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CompositeId getId() {
		return id;
	}

	public void setId(CompositeId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
