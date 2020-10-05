package model;

import observer.Evento;

/*
 * TODO OBSERVER.02.1
 * 
 * 1. Mude esta classe para que atue como um objeto do tipo Observavel (de interesse).
 * 
 */
public class SensorSeguranca {

	private String identificador;

	private boolean movimento;

	private boolean online;

	public boolean isMovimento() {
		return movimento;
	}

	public void setMovimento(boolean ativo) {
		/*
		 * TODO OBSERVER.02.2
		 * 
		 * 1. Notifique todos os objetos do tipo Observador (objetos interessados) que estivrem
		 * registrados nesta classe. 
		 * 
		 * 2. Passe o evento abaixo na notificação. Cuidado para nao setar antes de notificar!
		 */
		
		
		Evento evento = new Evento(this.identificador, "movimento", this.movimento, ativo);
		this.movimento = ativo;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		/*
		 * TODO OBSERVER.02.3
		 * 
		 * 1. Notifique todos os objetos do tipo Observador (objetos interessados) que estivrem
		 * registrados nesta classe. 
		 * 
		 * 2. Passe o evento abaixo na notificação. Cuidado para nao setar antes de notificar!
		 */
		
		Evento evento = new Evento(this.identificador, "online", this.movimento, online);
		this.online = online;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}




}
