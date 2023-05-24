package com.crud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Model.EmpModel;
import com.crud.Reop.Repos;



@RestController
public class EmpController {
	@Autowired
	 private Repos repos;
	 
	@GetMapping("/Employee/{eemail}")
	public Optional<EmpModel> getEmployee(@PathVariable("eemail")String eemail) {
		return repos.findById(eemail);
	}
	@GetMapping("/Employee")
	public List<EmpModel> getEmployees () {
		System.out.println(repos.findAll());
		return repos.findAll();
	}
	@PostMapping("/Employee")
	public EmpModel saveEmp( @RequestBody EmpModel empmodel) { 
		 repos.save(empmodel);
		 return empmodel;
	}
	@PutMapping("/Employee")
	public EmpModel updateEmp( @RequestBody EmpModel empModel) {
		repos.save(empModel);
		return empModel;
	}
	@DeleteMapping("/Employee/{eemail}")
	public String deleteEmp(@PathVariable("eemail")String eemail) {
//		@SuppressWarnings("deprecation")
		EmpModel empModel=repos.getOne(eemail) ;
		repos.delete(empModel);
		return "Deleted successfuly";
	}
	 
	
	

}
