package br.com.fernanda.client_CRUD_Spring_Thymeleaf.dao;

import br.com.fernanda.client_CRUD_Spring_Thymeleaf.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClientDao {

    void record(Client client);
    void remove(long id);
    List<Client> getAll();
    Client getById(long id);
    Client getByFiscal_code(String fiscal_code);

}
