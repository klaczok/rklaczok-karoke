package com.karaoke.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.karaoke.dto.GeneroMusicalDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="genero_musical")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneroMusical {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@NotNull
	@Column(name="nome")
	@Size(min=3, max=50)
	private String nome;
	
	public GeneroMusical(String nome) {
		this.nome = nome;
	}
	
	public GeneroMusical valueOfForm(GeneroMusicalDto generoDto) {
		return new GeneroMusical();
	}
	
	public GeneroMusicalDto generateDto(GeneroMusical genero) {
		return new GeneroMusicalDto(id, nome);
	}

	
}
