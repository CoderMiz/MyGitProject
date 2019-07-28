package com.boston.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boston.task.entities.Drug;
import com.boston.task.entities.MedicalRepresentative;
import com.boston.task.repository.DrugRepository;
import com.boston.task.repository.MRRepository;

@Service
public class MRService {
	
	@Autowired
	MRRepository mrRepo;	
	@Autowired
	DrugRepository drugRepo;
	
	@Autowired
	MRService mrService;
	
	
	public void saveDrug(Drug drug) {
		drugRepo.save(drug);
	}
	
	
	public void saveMr(MedicalRepresentative mr) {
		mrRepo.save(mr);
	}	
	
	public List<MedicalRepresentative> findAllMr() {
		return mrRepo.findAll();
	}
	
	
	public void deleteMr(MedicalRepresentative mr) {
		mrRepo.delete(mr);
	}
	
	public MedicalRepresentative findMrById(Integer Id) {
		Optional<MedicalRepresentative> op = mrRepo.findById(Id);
		 MedicalRepresentative mr = op.get();
		 return mr;
		 
	}
	
	/*
	 * public void UpdateMr(MedicalRepresentative mr) { MedicalRepresentative oldMr
	 * = mrService.findMrById(mr.getMrId()); oldMr.setName(mr.getName()); oldMr.s
	 * 
	 * }
	 */
 	

}
