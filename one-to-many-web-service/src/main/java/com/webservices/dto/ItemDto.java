package com.webservices.dto;

import java.util.Objects;

import com.webservices.entity.Item;

import lombok.Data;

@Data
public class ItemDto {
	
	private Long id;
	private String serialNumber;
	private PlainCartDto plainCartDto;
	
	public static ItemDto from(Item item) {
		ItemDto itemDto = new ItemDto();
		itemDto.setId(item.getId());
		itemDto.setSerialNumber(item.getSerialNumber());
		if(Objects.nonNull(item.getCart())){
            itemDto.setPlainCartDto(PlainCartDto.from(item.getCart()));
        }
		return itemDto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public PlainCartDto getPlainCartDto() {
		return plainCartDto;
	}

	public void setPlainCartDto(PlainCartDto plainCartDto) {
		this.plainCartDto = plainCartDto;
	}
	
}
