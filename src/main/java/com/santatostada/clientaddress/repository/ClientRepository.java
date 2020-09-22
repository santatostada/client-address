package com.santatostada.clientaddress.repository;

import com.santatostada.clientaddress.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findAll();

    Client getClientById(int id);

    @Transactional
    public void removeById(int id);
}
