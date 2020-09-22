package com.santatostada.clientaddress.service;

import com.santatostada.clientaddress.entity.Client;
import com.santatostada.clientaddress.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {
    @Autowired
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Client> findAllClients(){
        return clientRepository.findAll();
    }

    public List<Client> findAllBySubstring(String substring){
        return clientRepository.findAll();
    }

    public void removeById(int id){
        clientRepository.removeById(id);
    }

    public void addClient(Client client){
        clientRepository.save(client);
    }

    public Client getClientById(int id){
        return clientRepository.getClientById(id);
    }
}
