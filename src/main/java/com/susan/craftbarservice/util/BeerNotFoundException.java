package com.susan.craftbarservice.util;

public class BeerNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2803793906052065332L;

	public BeerNotFoundException(Long id) {
		super("Could not find beer " + id);
	}
}
