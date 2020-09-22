package com.santatostada.clientaddress.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientResponse {
    private int id;

    private String name;

    public ClientResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
