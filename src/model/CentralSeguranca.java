package model;

/*
 * TODO OBSERVER.05
 * 
 * 1. Mude esta classe para que atue como um objeto do tipo Observador (interessado).
 * 
 * 2. Implemente os metodos obrigatorios que surgirem para enquadramento desta classe como do tipo Observador.
 * Se o evento for de nome "movimento" e true, invoque chamarPolicia(idSensor) 
 * Se o evento for de nome "online", caso esteja false, invoque chamarSeguranca(idSensor). 
 * Perceba que este Observador faz "o que quiser" quando eh notificado, dependendo do nome do evento e valores por ele passados quando for notificado.
 * 
 */
public class CentralSeguranca {

	public void chamarPolicia(String identificadorSensorSeguranca) {
		System.out.println("chamando policia para sensor -->"+identificadorSensorSeguranca);
	}

	public void chamarSegurancaPrivada(String identificadorSensorSeguranca) {
		System.out.println("chamando seguranca privada para sensor -->"+identificadorSensorSeguranca);
	}
	
}
