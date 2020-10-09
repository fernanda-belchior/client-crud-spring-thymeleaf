package br.com.fernanda.clientcrud.repository;

import br.com.fernanda.clientcrud.dto.ClientDTO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<ClientDTO, Long> {

}
