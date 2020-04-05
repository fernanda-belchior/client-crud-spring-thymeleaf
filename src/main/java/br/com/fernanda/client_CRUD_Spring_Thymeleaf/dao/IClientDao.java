package br.com.fernanda.client_CRUD_Spring_Thymeleaf.dao;

import br.com.fernanda.client_CRUD_Spring_Thymeleaf.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IClientDao extends JpaRepository<Client, Long>{

}
