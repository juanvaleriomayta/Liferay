package com.liferay.docs.guestbook.model;

public class Entry {

	private String name;
	private String apellido;
	private String message;

	public Entry() {
		this.name = null;
		this.apellido = null;
		this.message = null;

	}

	public Entry(String name, String apellido, String message) {
		setName(name);
		setApellido(apellido);
		setMessage(message);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
