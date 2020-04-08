package br.usjt.usjt_ccp3anmca_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Usuario;

public class TesteAtualizaUsuarios {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = manager.find(Usuario.class, 1L);
		u.setNome(u.getNome()+" da Silva");
		u.setEmail("anasilva@usjt.br");
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
