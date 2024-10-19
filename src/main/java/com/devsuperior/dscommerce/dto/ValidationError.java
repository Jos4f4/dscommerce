package com.devsuperior.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {
	
	public ValidationError(Instant timestamp, Integer status, String error, String path) {
		super(timestamp, status, error, path);
	}

	private List<FieldMessage> errors = new ArrayList<>();
	
	public void AddError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
}