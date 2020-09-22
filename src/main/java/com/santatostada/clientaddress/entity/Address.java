package com.santatostada.clientaddress.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String address;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Address() {
    }

    public Address(String address, Client client){
        this.address = address;
        this.client = client;
    }
}
