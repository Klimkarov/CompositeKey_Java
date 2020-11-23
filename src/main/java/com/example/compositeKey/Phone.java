package com.example.compositeKey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "PHONE")
public class Phone {  
	
	@Id
	@Column(name = "number")
	private String number;
	
	@ManyToOne
	@JoinColumns({ 
		@JoinColumn(name = "Company_ID", referencedColumnName = "Company_ID"),
		@JoinColumn(name = "Project_ID", referencedColumnName = "Project_ID"),
	})
	private Employee employee;

}
