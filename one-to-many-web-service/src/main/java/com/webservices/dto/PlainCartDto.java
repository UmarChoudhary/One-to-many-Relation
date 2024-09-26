package com.webservices.dto;

import com.webservices.entity.Cart;

import lombok.Data;

@Data
public class PlainCartDto {
	
	private Long id;
    private String name;

    public static PlainCartDto from(Cart cart) {
    	PlainCartDto plainCartDto = new PlainCartDto();
        plainCartDto.setId(cart.getId());
        plainCartDto.setName(cart.getName());
        return plainCartDto;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
