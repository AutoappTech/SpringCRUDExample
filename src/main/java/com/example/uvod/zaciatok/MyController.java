package com.example.uvod.zaciatok;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MyController {
	
	private final PouzivatelRepository pouzivatelRepo;
	
	public MyController(PouzivatelRepository pouzivatelRepo) {
		this.pouzivatelRepo = pouzivatelRepo;
	}
	
	@GetMapping("/pouzivatel")
	public Iterable<Pouzivatel> vratPouzivatelov() {
		return pouzivatelRepo.findAll();
	}
	
	@PostMapping("/pouzivatel")
	public ResponseEntity<?> vytvorPouzivatela(@RequestBody Pouzivatel pouzivatel){
		pouzivatelRepo.save(pouzivatel);
		return ResponseEntity.ok(pouzivatel);
	}
	
	@DeleteMapping("/pouzivatel/{pouzivatelId}")
	public ResponseEntity<?> vymazPouzivatela(@PathVariable Integer pouzivatelId){
		Optional<Pouzivatel> pouzivatelOptional = pouzivatelRepo.findById(pouzivatelId);
		if (pouzivatelOptional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		pouzivatelRepo.delete(pouzivatelOptional.get());
		return ResponseEntity.ok().build();
	}
	
//	@PatchMapping("/pouzivatel/{pouzivatelId}")
//	public ResponseEntity<?> upravPouzivatela(@PathVariable Integer pouzivatelId, 
//			@RequestBody Pouzivatel pouzivatel) {
//		Pouzivatel pouzivatelzDb = pouzivatelRepo.findById(pouzivatelId).get();
//		
//	}
}