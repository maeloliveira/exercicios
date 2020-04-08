package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;


import org.springframework.data.annotation.Id;

@Entity
@Table(name = "tb_feedback")
public class Feedback {
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}