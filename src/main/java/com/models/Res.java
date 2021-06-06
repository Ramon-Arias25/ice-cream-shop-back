package com.models;

import org.springframework.stereotype.Component;

@Component
public class Res {

	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
