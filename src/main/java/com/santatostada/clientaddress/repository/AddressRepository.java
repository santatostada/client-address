package com.santatostada.clientaddress.repository;

import com.santatostada.clientaddress.entity.Address;
import com.santatostada.clientaddress.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByClientId(int id);

    @Transactional
    public void removeById(int id);
}
