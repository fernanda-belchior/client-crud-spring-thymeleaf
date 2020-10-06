package br.com.fernanda.clientcrud.dao;

import br.com.fernanda.clientcrud.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IClientDao extends JpaRepository<Client, Long> {

}
