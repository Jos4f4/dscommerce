package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {
	
	private Long id;
	
	@Size(min = 3, max = 80, message = "Precisa ter entre 3 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String name;
	
	@Size(min = 10, message = "Descrição precisa ter no mínimo 10 caracteres")
	@NotBlank(message = "Campo requerido")
	private String description;
	
	@Positive(message = "O preço deve ser positivo")
	private Double price;
	
	private String imgURL;
	
	public ProductDTO(Long id, String name, String description, Double price, String imgURL) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgURL = imgURL;
	}
	
	public ProductDTO(Product entity) {
		super();
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		price = entity.getPrice();
		imgURL = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}

	public String getImgUrl() {
		return imgURL;
	}
	
}
