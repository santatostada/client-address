package com.santatostada.clientaddress.service;

import com.santatostada.clientaddress.entity.Address;
import com.santatostada.clientaddress.entity.Client;
import com.santatostada.clientaddress.repository.AddressRepository;
import com.santatostada.clientaddress.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public void addAddress(Address address){
        addressRepository.save(address);
    }

    public List<Address> getAddressesByClientId(int id){
        return addressRepository.findAllByClientId(id);
    }

    public void removeAddress(int id){
        addressRepository.removeById(id);
    }
}
