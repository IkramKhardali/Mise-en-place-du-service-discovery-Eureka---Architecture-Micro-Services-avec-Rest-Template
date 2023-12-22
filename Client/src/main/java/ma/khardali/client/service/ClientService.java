package ma.khardali.client.service;

import ma.khardali.client.entities.Client;
import ma.khardali.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepo;

    public Optional<Client> findById(Long id) {
        return clientRepo.findById(id);
    }

    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    public Client save(Client client) {
        return clientRepo.save(client);
    }



    public void deleteById(Long id) {
        clientRepo.deleteById(id);
    }

}
