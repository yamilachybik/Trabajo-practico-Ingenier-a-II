import java.util.Arrays;

public class Viaje {

	public Colectivo cole;
	public int hora;
	public double montoPasaje;
	
	public Viaje(Colectivo cole, int hora, double montoPasaje) {
		this.cole = cole;
		this.hora = hora;
		this.montoPasaje = montoPasaje;
	}

	public Colectivo getCole() {
		return cole;
	}

	public void setCole(Colectivo cole) {
		this.cole = cole;
	}

	

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public double getMontoPasaje() {
		return montoPasaje;
	}

	public void setMontoPasaje(int montoPasaje) {
		this.montoPasaje = montoPasaje;
	}

	@Override
	public String toString() {
		return "Viaje [cole=" + cole + ", horario=" +hora + ", montoPasaje=" + montoPasaje + "]";
	}
	
	
}
