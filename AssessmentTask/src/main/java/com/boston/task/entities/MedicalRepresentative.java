package com.boston.task.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="medical_representative")
public class MedicalRepresentative {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="mr_id")
	private Integer mrId;
	
	private String name;
	
	public MedicalRepresentative() {
	}



	@OneToMany
	@JoinColumn(name="mr_id" , nullable=true)
	//@NotFound(action = NotFoundAction.IGNORE)
	private Set<Drug> assignedDrugs;



	public Integer getMrId() {
		return mrId;
	}

	public void setMrId(Integer mrId) {
		this.mrId = mrId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Drug> getAssignedDrugs() {
		return assignedDrugs;
	}

	public void setAssignedDrugs(Set<Drug> assignedDrugs) {
		this.assignedDrugs = assignedDrugs;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MedicalRepresentative [mrId=").append(mrId).append(", name=").append(name)
				.append(", assignedDrugs=").append(assignedDrugs).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assignedDrugs == null) ? 0 : assignedDrugs.hashCode());
		result = prime * result + ((mrId == null) ? 0 : mrId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicalRepresentative other = (MedicalRepresentative) obj;
		if (assignedDrugs == null) {
			if (other.assignedDrugs != null)
				return false;
		} else if (!assignedDrugs.equals(other.assignedDrugs))
			return false;
		if (mrId == null) {
			if (other.mrId != null)
				return false;
		} else if (!mrId.equals(other.mrId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
	
	
}
