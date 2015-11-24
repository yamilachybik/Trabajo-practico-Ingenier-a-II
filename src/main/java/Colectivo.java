
public class Colectivo {

	private int linea;
	private String empresa;
	private int nroInterno;
	
	public Colectivo(int linea, String empresa, int nroInterno) {
		super();
		this.linea = linea;
		this.empresa = empresa;
		this.nroInterno = nroInterno;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNroInterno() {
		return nroInterno;
	}

	public void setNroInterno(int nroInterno) {
		this.nroInterno = nroInterno;
	}

	
	public String toString() {
		return "Colectivo [linea=" + linea + ", empresa=" + empresa + ", nroInterno=" + nroInterno + "]";
	}
	
	
	
}
