import java.util.ArrayList;

public class TarjetaMedioBoleto extends Tarjeta{

	public TarjetaMedioBoleto(double saldo, int numeroTarjeta) {
		super(saldo, numeroTarjeta);
		// TODO Auto-generated constructor stub
	}

	public boolean pagarBoleto(Colectivo cole, int hora) {
		if(transbordo(cole.getLinea(), hora) == true && saldo > 0.96 && horaMedioBoleto(hora) == true){
			setSaldo(saldo-0.96);
			Viaje viaje = new Viaje(cole,hora,0.96);
			viajes.add(viaje);
			return true;
			
		} else if(saldo > 2.90  && horaMedioBoleto(hora) == true){
			setSaldo(saldo-2.90);
			Viaje viaje = new Viaje(cole,hora,2.90);
			viajes.add(viaje);
			return true;
			
		} else if(horaMedioBoleto(hora) == false){
			setSaldo(saldo-5.75);
			Viaje viaje = new Viaje(cole,hora,5.75);
			viajes.add(viaje);
			return true;
		} else return false;
		
	}
	
	

	

}
