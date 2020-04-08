package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_consumo")
public class Consumo {
	@javax.persistence.Id
	@GeneratedValue

	private Long Id;
	private Date DataHora;

	@ManyToOne
	private Feedback feedback;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getDataHora() {
		return DataHora;
	}

	public void setDataHora(Date date) {
		DataHora = date;
	}

}
