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
    private String name;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Address() {
    }

    public Address(String name, Client client){
        this.name = name;
        this.client = client;
    }
}
