package model;

import observer.Evento;
import observer.Observador;

/*
 * TODO OBSERVER.03
 * 
 * 1. Mude esta classe para que atue como um objeto do tipo Observador (interessado).
 * 
 * 2. Implemente os metodos obrigatorios que surgirem para enquadramento desta classe como do tipo Observador.
 * Se o evento for "movimento" true, ou "online" true ou false, este interessado deve ser notificado por email do problema: chame enviarEmail().
 * Perceba que este Observador faz "o que quiser" quando eh notificado, dependendo do nome do evento e valores por ele passados quando for notificado.	
 */

//1
public class Mensageiro implements Observador{

	private String nome;

	public Mensageiro() {
		this.nome = "Dono Fulano de Tal";
	}
	
	public String getNome() {
		return nome;
	}

	public void enviarEmail(String mensagem) {
		System.out.println("email enviado para ---> " + this.nome + " \nmensagem ---> "+mensagem);
	}

	//2
	@Override
	public void tratarEvento(Evento evento) {
		if(evento.getNomeEvento().equals("movimento") && 
				evento.getValorNovo().equals(true) ||
				evento.getNomeEvento().equals("online")) {
			
			enviarEmail("Movimento: true"+
						"\nOnline: true ou false");
		}
		
	}

}
