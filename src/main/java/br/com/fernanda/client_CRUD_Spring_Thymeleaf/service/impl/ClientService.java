package br.com.fernanda.client_CRUD_Spring_Thymeleaf.service.impl;

import br.com.fernanda.client_CRUD_Spring_Thymeleaf.dao.impl.ClientDao;
import br.com.fernanda.client_CRUD_Spring_Thymeleaf.model.Client;
import br.com.fernanda.client_CRUD_Spring_Thymeleaf.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public void record(Client client) {
        clientDao.record(client);
    }

    @Override
    public void update(Client client) {
        clientDao.update(client);
    }

    @Override
    public void remove(long id) {
        clientDao.remove(id);
    }

    @Override
    public List<Client> getAll() {
        return clientDao.getAll();
    }

    @Override
    public Client getById(long id) {
        return clientDao.getById(id);
    }

    @Override
    public Client getByFiscal_code(String fiscal_code) {
        return clientDao.getByFiscal_code(fiscal_code);
    }
}
