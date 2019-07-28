

package com.boston.task;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boston.task.repository.DrugRepository;
import com.boston.task.repository.MRRepository;

@SpringBootApplication
public class AssessmentTaskApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AssessmentTaskApplication.class, args);
			MRRepository mrRepo = context.getBean("MRRepository",MRRepository.class);
			DrugRepository dr =  context.getBean("drugRepository", DrugRepository.class);
			
		/*
		 * Drug drug = new Drug(); drug.setDrugName("Acetylene"); drug.setDrugId(23);
		 * dr.save(drug); Set<Drug> drugs = new HashSet(); drugs.add(drug);
		 * 
		 * MedicalRepresentative mr = new MedicalRepresentative(); mr.setName("John");
		 * mr.setMrId(12); mr.setAssignedDrugs(drugs); mrRepo.save(mr);
		 */
			
			
			}
	
	
	
	
	}

