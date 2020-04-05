package br.com.fernanda.client_CRUD_Spring_Thymeleaf.service;

import br.com.fernanda.client_CRUD_Spring_Thymeleaf.model.Client;

import java.util.List;

public interface IClientService {

    void record(Client client);
    void remove(Long id);
    List<Client> getAll();
    Client getById(long id);
}
