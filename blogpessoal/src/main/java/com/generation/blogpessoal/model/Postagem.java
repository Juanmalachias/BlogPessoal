package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_postagens")

public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O atributo titulo é obrigatório")
	@Size(min=5,max=100,message = "O atributo titulo devet ter no minmo 5 caracteres e no maximo 100 caracteres" )
	private String titulo;

	@NotBlank(message = "O atributo titulo é obrigatório")
	@Size(min=10,max=1000,message = "O atributo titulo devet ter no minmo 10 caracteres e no maximo 1000 caracteres" )
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	

	public long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTexto() {
		return texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}


}

