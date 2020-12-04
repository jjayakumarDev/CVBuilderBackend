package com.cvbuilder.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cvbuilder.dao.CVBuilderRepository;
import com.cvbuilder.dao.LoginRepository;
import com.cvbuilder.entity.CVInfo;
import com.cvbuilder.entity.Login;

@CrossOrigin(origins = "https://master.d301d2fm43kvix.amplifyapp.com")
@RestController
public class CVBuilderController {
	
	@Autowired
	CVBuilderRepository cvbuilderRepo;
	
	@Autowired
	LoginRepository loginRepo;

	@GetMapping(path = "/getCVinfo/{email}")
	public ResponseEntity<Optional<CVInfo>> getCVinfo(@PathVariable String email) {
		Optional<CVInfo> cvInfo = cvbuilderRepo.findById(email);
		return ResponseEntity.ok(cvInfo);
	}
	
	@PostMapping(path = "/createCV")
	public CVInfo createCV(@RequestBody CVInfo cvinfo) {
		return cvbuilderRepo.save(cvinfo);
	}
	
	@PutMapping(path = "/updateCV")
	public ResponseEntity<CVInfo> updateCV(@RequestBody CVInfo cvinfo) {
		cvbuilderRepo.save(cvinfo);
		return ResponseEntity.ok(cvinfo);
	}
	
	@DeleteMapping(path = "/deleteCV/{email}")
	public ResponseEntity<Map<String, Boolean>> deleteCV(@PathVariable String email) {
		cvbuilderRepo.deleteById(email);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(path = "/signIn/{email}/{password}")
	public ResponseEntity<Optional<Login>> signIn(@PathVariable String email, @PathVariable String password) {
		Optional<Login> login = loginRepo.findById(email);
		if(login.isPresent()) {
			String pass = login.get().getPassword();
			if(pass.equals(password)) {
				return ResponseEntity.ok(login);
			} else {
				login = Optional.empty();
			}
		}
		
		return ResponseEntity.ok(login);
	}
	
	@PostMapping(path = "/signUp")
	public Login createAccount(@RequestBody Login login) {
		return loginRepo.save(login);
	}

}
