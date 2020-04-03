package br.com.fernanda.client_CRUD_Spring_Thymeleaf.dao.impl;

import br.com.fernanda.client_CRUD_Spring_Thymeleaf.dao.IClientDao;
import br.com.fernanda.client_CRUD_Spring_Thymeleaf.model.Client;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ClientDao implements IClientDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void record(Client client) {
         entityManager.persist(client);
    }


    @Override
    public void remove(long id) {
        entityManager.remove(id);

    }

    @Override
    public List<Client> getAll() {
        List<Client> list = null;
        String sql = "SELECT client FROM " +Client.class + " client";
        Query query = entityManager.createQuery(sql);
        return query.getResultList();
    }

    @Override
    public Client getById(long id) {
        return entityManager.find(Client.class, id);
    }

    @Override
    public Client getByFiscal_code(String fiscal_code) {
      return entityManager.createQuery("select c from " + Client.class + " c where c.fiscal_code= :fiscal_code", Client.class)
                .setParameter("fiscal_code", fiscal_code)
                .getSingleResult();
    }
}
