package com.foodviolatorsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodviolatorsrest.model.HistSeattle;
import com.foodviolatorsrest.repository.HistSeattleRepository;

@RestController
@RequestMapping("/api")
public class SeattleController {

	@Autowired
	HistSeattleRepository histSeattleRepo;

	@GetMapping("/seattle")
	public List<HistSeattle> getAllNotes() {
		System.out.println("seattle" + histSeattleRepo.getHistSeattleItems());
		return histSeattleRepo.getHistSeattleItems();
	}
}
