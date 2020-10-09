package br.com.fernanda.clientcrud.service.impl;

import br.com.fernanda.clientcrud.dto.ClientDTO;
import br.com.fernanda.clientcrud.repository.ClientRepository;
import br.com.fernanda.clientcrud.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void record(ClientDTO client) {
        clientRepository.save(client);
    }

    @Override
    public void remove(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<ClientDTO> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public ClientDTO getById(long id) {
        return clientRepository.getOne(id);
    }

}
