package com.example.compositeKey; // Formiranje na classa - tabela za Composite Key //

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;




@Embeddable	
public class CompositeId implements Serializable {  
	
	@Column(name = "Company_ID")            
	private Long CompanyID;                
	
	@Column(name = "Project_ID")
	private Long ProjectID;	
	
	public CompositeId() {
		
	}

	public CompositeId(Long companyID, Long projectID) {
		super();
		CompanyID = companyID;
		ProjectID = projectID;
	}

	public Long getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(Long companyID) {
		CompanyID = companyID;
	}

	public Long getProjectID() {
		return ProjectID;
	}

	public void setProjectID(Long projectID) {
		ProjectID = projectID;
	}
	
	

}
