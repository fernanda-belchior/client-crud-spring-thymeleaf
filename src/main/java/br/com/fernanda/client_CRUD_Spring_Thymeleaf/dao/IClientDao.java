package br.com.fernanda.client_CRUD_Spring_Thymeleaf.dao;

import br.com.fernanda.client_CRUD_Spring_Thymeleaf.model.Client;

import java.util.List;

public interface IClientDao {

    void record(Client client);
    void update (Client client);
    void remove(long id);
    List<Client> getAll();
    Client getById(long id);
    Client getByFiscal_code(String cpf);

}
