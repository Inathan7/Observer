package observer;

import java.util.HashSet;
import java.util.Set;

/*
 * TODO OBSERVER.01
 * 
 * 1. Implemente os metodos desta classe abstrata que equivale ao supertipo de objetos observaveis (de interesse).
 *
 */
public abstract class Observavel {
	
	private Set<Observador> observadoresRegistrados = new HashSet<>();
	
	public void adicionarObserver(Observador observer) {
		//TODO implemente o codigo que permite a um observable (de interesse) adicionar um objeto observer (interessado)
	}
	
	public void removerObserver(Observador observer) {
		//TODO implemente o codigo que permite a um observable (de interesse) remover um objeto observer (interessado)
	}
	
	public void notificarTodos(Evento evento) {
		//TODO implemente codigo que notifica todos os obervers sobre mudancas no observable. Nao esquecer de passar um objeto Event capaz de informar/caracterizar o que mudou no observer
	}

}
