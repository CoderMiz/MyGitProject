package com.boston.task.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boston.task.entities.MedicalRepresentative;

@Repository
public interface MRRepository extends JpaRepository<MedicalRepresentative, Integer>{

	

	public Optional<MedicalRepresentative> findById(Integer Id);
	
	
	
	
}
