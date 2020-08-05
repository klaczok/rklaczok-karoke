package com.karaoke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.karaoke.dto.GeneroMusicalDto;
import com.karaoke.service.GeneroMusicalService;

@RestController
@RequestMapping("/v1/generos")
public class GeneroMusicalController {
	
	@Autowired
	private GeneroMusicalService generoMusicalService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<GeneroMusicalDto> findAll(){
		return generoMusicalService.findAll();
	}

}
