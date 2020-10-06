package br.com.fernanda.clientcrud.service.impl;

import br.com.fernanda.clientcrud.dao.IClientDao;
import br.com.fernanda.clientcrud.model.Client;
import br.com.fernanda.clientcrud.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    @Autowired
    private IClientDao clientDao;

    @Override
    public void record(Client client) {
        clientDao.save(client);
    }

    @Override
    public void remove(Long id) {
        clientDao.deleteById(id);
    }

    @Override
    public List<Client> getAll() {
        return clientDao.findAll();
    }

    @Override
    public Client getById(long id) {
        return clientDao.getOne(id);
    }

}
