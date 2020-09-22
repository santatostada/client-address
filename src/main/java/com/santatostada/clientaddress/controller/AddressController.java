package com.santatostada.clientaddress.controller;

import com.santatostada.clientaddress.entity.Address;
import com.santatostada.clientaddress.entity.Client;
import com.santatostada.clientaddress.response.AddressResponse;
import com.santatostada.clientaddress.service.AddressService;
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
public class AddressController {
    @Autowired
    AddressService addressService;

    @Autowired
    ClientService clientService;

    @RequestMapping("/getAddress")
    public List<AddressResponse> getAddress(@RequestParam(name = "clientId") int clientId){
        List<Address> addresses = addressService.getAddressesByClientId(clientId);
        List<AddressResponse> addressResponses = addresses.stream()
                .map((address) -> new AddressResponse(address.getId(), address.getAddress()))
                .collect(Collectors.toList());
        return addressResponses;
    }

    @RequestMapping("/removeAddress")
    public void removeAddress(int id){
        addressService.removeAddress(id);
    }

    @RequestMapping("/addAddress")
    public void addAddress(@RequestParam(name="clientId") int clientId,
                           @RequestParam(name="name") String name){
        Client client = clientService.getClientById(clientId);
        Address clientAddress = new Address(name, client);
        addressService.addAddress(clientAddress);
    }
}
