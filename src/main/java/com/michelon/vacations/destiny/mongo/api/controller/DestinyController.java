package com.michelon.vacations.destiny.mongo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michelon.vacations.destiny.mongo.api.domain.Destiny;
import com.michelon.vacations.destiny.mongo.api.repository.DestinyRepository;


@RestController
@RequestMapping("/destiny")
public class DestinyController {
	
	@Autowired
	private DestinyRepository destinyRepository;

	
	@GetMapping
	public List<Destiny> getDestinyList() {
		return destinyRepository.findAll();
	}
	
	@PostMapping
	public Destiny createNewDestiny(@RequestBody Destiny destiny) {
		return destinyRepository.save(destiny);
	}
}
