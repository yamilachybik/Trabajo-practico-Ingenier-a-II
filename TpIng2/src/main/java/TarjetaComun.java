import java.util.ArrayList;

public class TarjetaComun extends Tarjeta{

	public TarjetaComun(double saldo, int numeroTarjeta) {
		super(saldo, numeroTarjeta);
		
	}

	public boolean pagarBoleto(Colectivo cole, int hora) {
		if(transbordo(cole.getLinea(), hora) == true && saldo > 1.90){
			setSaldo(saldo-1.90);
			Viaje viaje = new Viaje(cole,hora,1.90);
			viajes.add(viaje);
			return true;
			
		} else if(saldo > 5.75){
			setSaldo(saldo-5.75);
			Viaje viaje = new Viaje(cole,hora,5.75);
			viajes.add(viaje);
			return true;
			
		} else return false;
		
	}

	

	
}
