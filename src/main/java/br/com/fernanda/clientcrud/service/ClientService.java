package br.com.fernanda.clientcrud.service;

import br.com.fernanda.clientcrud.dto.ClientDTO;

import java.util.List;

public interface ClientService {

    void record(ClientDTO client);

    void remove(Long id);

    List<ClientDTO> getAll();

    ClientDTO getById(long id);
}
