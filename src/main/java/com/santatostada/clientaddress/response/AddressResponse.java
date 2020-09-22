package com.santatostada.clientaddress.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressResponse {
    private int id;

    private String name;

    public AddressResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
