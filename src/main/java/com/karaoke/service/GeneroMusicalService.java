package com.karaoke.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karaoke.dto.GeneroMusicalDto;
import com.karaoke.respository.GeneroMusicalRepository;

@Service
public class GeneroMusicalService {

	@Autowired
	private GeneroMusicalRepository generoMusicalRepository;
	
	public List<GeneroMusicalDto> findAll() {
		return generoMusicalRepository.findAll().stream().map(g -> g.generateDto(g)).collect(Collectors.toList());
	}
}
