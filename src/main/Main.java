package main;

import model.CentralSeguranca;
import model.ControleAlarme;
import model.Mensageiro;
import model.SensorSeguranca;

public class Main {

	public static void main(String[] args) {
		/*
		 * TODO OBSERVER.06.1
		 * 
		 * 1. Registre todos os objetos interessados no sensor1, antes da linha simularEventos(sensor1);
		 * 
		 * 2. Execute este main().
		 * 
		 */
		
		SensorSeguranca sensor1 = new SensorSeguranca();
		sensor1.setIdentificador("SENSOR 1");
		
		CentralSeguranca central = new CentralSeguranca();

		Mensageiro mensageiro = new Mensageiro();
		
		ControleAlarme controle = new ControleAlarme();
		
		
		//1 & 2
		sensor1.adicionarObserver(central);
		sensor1.adicionarObserver(mensageiro);
		sensor1.adicionarObserver(controle);
		
		simularEventos(sensor1);
		
		
		/*
		 * TODO OBSERVER.06.2
		 * 
		 * 1. Descomente as linhas abaixo.
		 * 
		 * 2. Registre todos os mesmos objetos interessados no sensor2, criado abaixo, antes da linha simularEventos(sensor2);
		 * 
		 * 3. Execute este main()
		 * 
		 * 4. Todos os objetos foram modificados quando simularEventos() operou no segundo sensor?
		 * Um mesmo objeto interessado pode se registrar em mais de um objeto de interesse, se conveniente?
		 * Como ele pode saber quem o notificou nesses casos?
		 * 
		 * [Não, pois eles foram setados com os mesmos valores, tornando o funcionamento o mesmo.
		 * Pode se registrar sim, pois esse adicionamento é feito pelo supertipo observavel, evitando o acoplamento direto.
		 * Pode saber através do tipo de evento, que descreve com detalhes o acontecimento através do método de notificação,
		 * onde esse evento é passado.]
		 * 
		 * 
		 * 
		 */
		SensorSeguranca sensor2 = new SensorSeguranca();
		sensor2.setIdentificador("SENSOR 2");
		
		//1 & 2
		sensor2.adicionarObserver(central);
		sensor2.adicionarObserver(mensageiro);
		sensor2.adicionarObserver(controle);
		
		simularEventos(sensor2);
	
	}

	private static void simularEventos(SensorSeguranca sensor) {
		sensor.setMovimento(true);
		sensor.setOnline(true);
		sensor.setMovimento(false);
		sensor.setMovimento(false);
		sensor.setMovimento(false);
		sensor.setOnline(false);
		
	}

}
