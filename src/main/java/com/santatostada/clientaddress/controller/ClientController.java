package com.santatostada.clientaddress.controller;


import com.santatostada.clientaddress.entity.Client;
import com.santatostada.clientaddress.response.ClientResponse;
import com.santatostada.clientaddress.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Validated
public class ClientController {
    @Autowired
    ClientService clientService;

    @RequestMapping("/getAllClients")
    public List<ClientResponse> getAllClients(){
        List<Client> clientList = clientService.findAllClients();
        List<ClientResponse> clientResponseList = clientList
                .stream()
                .map(client -> new ClientResponse(client.getId(), client.getName()))
                .collect(Collectors.toList());
        return clientResponseList;
        };

    @RequestMapping("/getAllClientsWithSubstring")
    public List<ClientResponse> getAllClientsWithSubstring(String substring){
        List<Client> clientList = clientService.findAllClients();
        List<ClientResponse> clientResponseList = clientList
                .stream()
                .filter(client -> client.getName().contains(substring))
                .map(client -> new ClientResponse(client.getId(), client.getName()))
                .collect(Collectors.toList());
        return clientResponseList;
    }

    @RequestMapping("/addClient")
    public void addClient(@RequestParam(name="name") String name){
        Client client = new Client(name);
        clientService.addClient(client);
    }

    @RequestMapping("/removeClient")
    public void removeClient(int id){
        clientService.removeById(id);
    }
}
