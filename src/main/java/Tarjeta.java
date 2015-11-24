import java.util.ArrayList;

public abstract class Tarjeta {

	public double saldo;
	public int numeroTarjeta;
	public ArrayList <Viaje> viajes = new ArrayList <Viaje>();
	
	
	public Tarjeta(double saldo, int numeroTarjeta) {
		super();
		this.saldo = saldo;
		this.numeroTarjeta = numeroTarjeta;

	}

	public abstract boolean pagarBoleto(Colectivo cole, int hora);
	
	public ArrayList<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(ArrayList<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	
	
	public Viaje ultimoViaje(){
		if(viajes.size()==0){
			return null;
		} else return viajes.get(viajes.size()-1);
	}
	
	public double recarga(int monto){
		if(monto == 196 ){
			saldo = saldo + monto + 34;
			
		}else if(monto == 368){
			saldo = saldo + monto + 92;
			
		}else 
			saldo = saldo + monto;	
			return saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	
	// se verifica que se cumpla el transbordo
	public boolean transbordo(int linea,int hora){
		if(ultimoViaje() == null){
			return false;
		}else if(ultimoViaje().getCole().getLinea() != linea && hora-ultimoViaje().getHora() <= 100){
			return true;
		} else 
			return false;
	}
	
	
	public boolean horaMedioBoleto(int hora){
		if(hora>=600 && hora<=2400){
			return true;
		} else return false;
	}
}
