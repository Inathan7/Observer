package model;

import java.awt.Toolkit;

import observer.Evento;
import observer.Observador;


/*
 * TODO OBSERVER.04
 * 
 * 1. Mude esta classe para que atue como um objeto do tipo Observador (interessado).
 * 
 * 2. Implemente os metodos obrigatorios que surgirem para enquadramento desta classe como do tipo Observador.
 * Se o evento for de nome "movimento", com valor true, chame dispararAlarme(). 
 * Se o evento for de nome "movimento", com valor false, chame pararAlarme(). 
 * Perceba que este Observador faz "o que quiser" quando eh notificado, dependendo do nome do evento e valores por ele passados quando for notificado.
 * 
 */
//1
public class ControleAlarme implements Observador {

	public  void dispararAlarme() {
		int i = 0;
		while (i<5) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Toolkit.getDefaultToolkit().beep();
			i++;
		}
	}


	public void pararAlarme() {
		int i = 0;
		while (i<3) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Toolkit.getDefaultToolkit().beep();
			i++;
		}
	}

//2
	@Override
	public void tratarEvento(Evento evento) {
		if(evento.getNomeEvento().equals("movimento") &&
				evento.getValorNovo().equals(true)) {
			dispararAlarme();
		}else if(evento.getNomeEvento().equals("movimento") &&
				evento.getValorAntigo().equals(false)) {
			pararAlarme();
		}
		
	}
}
