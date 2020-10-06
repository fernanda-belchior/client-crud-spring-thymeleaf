package br.com.fernanda.clientcrud.service;

import br.com.fernanda.clientcrud.model.Client;

import java.util.List;

public interface IClientService {

    void record(Client client);

    void remove(Long id);

    List<Client> getAll();

    Client getById(long id);
}
