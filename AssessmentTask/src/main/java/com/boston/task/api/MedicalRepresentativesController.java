package com.boston.task.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boston.task.entities.MedicalRepresentative;
import com.boston.task.service.MRService;

@RestController
@RequestMapping("/services")
public class MedicalRepresentativesController {
	
	@Autowired
	MRService mrService;
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	//@PostMapping(value="/addMedicalRepresentative", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE )
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> saveMedicalRepresentative(@RequestBody MedicalRepresentative mr) {
		mrService.saveMr(mr);
		return new ResponseEntity("MedicalRepresentative added successfully!", HttpStatus.OK);
	}
	
	
	@GetMapping(value="/getAllMedicalRepresentative" , produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<MedicalRepresentative> getAllMr(){
	  return mrService.findAllMr();
	}
	
	@DeleteMapping(value="/deleteMr", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteMr(@RequestBody MedicalRepresentative mr){
		mrService.deleteMr(mr);
		return new ResponseEntity("Requested Mr successfully deleted" , HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/MrId/{id}")
	public MedicalRepresentative findMrWithId(@PathVariable("id") Integer id) {
		return mrService.findMrById(id);
	}
	
	
	
	
}
