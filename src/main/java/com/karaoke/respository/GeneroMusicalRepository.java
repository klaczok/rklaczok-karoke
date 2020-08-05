package com.karaoke.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karaoke.model.GeneroMusical;

public interface GeneroMusicalRepository extends JpaRepository<GeneroMusical, Long>{

	public Optional<GeneroMusical> findByNome(String nome);
}
