package com.santatostada.clientaddress.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressResponse {
    private int id;

    private String address;

    public AddressResponse(int id, String address) {
        this.id = id;
        this.address = address;
    }
}
