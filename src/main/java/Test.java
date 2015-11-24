import static org.junit.Assert.*;

import junit.framework.TestCase;

public class Test extends TestCase{

	@org.junit.Test
	public void testRecarga(){
		TarjetaComun tc = new TarjetaComun(0, 43432);
		TarjetaMedioBoleto tmb = new TarjetaMedioBoleto(100, 43321);
		assertEquals("esperado 100.0",100.0, tc.recarga(100));
		assertEquals("esperado 200.0",200.0, tmb.recarga(100));
		
	}
	
	
	@org.junit.Test
	public void testUltimoViaje(){
		//no existen viajes (verificar que este bien el assert si es ambos parametros lo mismo)
		TarjetaComun tc = new TarjetaComun(185, 43432);
		assertEquals(0,tc.getViajes().size());
		//agrega un viaje al array
		Colectivo c = new Colectivo(11, "Rosario Bus", 33);
		TarjetaMedioBoleto tmb = new TarjetaMedioBoleto(100, 43321);
		tmb.pagarBoleto(c, 1433);
		assertEquals(1, tmb.getViajes().size());
		
	}

	@org.junit.Test
	public void testPagarBoleto(){
		Colectivo c = new Colectivo(11, "Rosario Bus", 33);
		Colectivo c2 = new Colectivo(12, "semtur", 11);
		Colectivo c3 = new Colectivo(5, "expreso", 15);
		Colectivo c4 = new Colectivo(5, "expreso", 12);
		Colectivo c5 = new Colectivo(24, "expreso", 12);
		
		//TARJETA COMUN
		TarjetaComun tc = new TarjetaComun(20, 43432);
		//paga el boleto con suficiente saldo
		assertEquals(true,tc.pagarBoleto(c, 1230));
		//paga el boleto con transbordo
		assertEquals(true,tc.pagarBoleto(c2, 1315));
		//paga boleto sin transbordo
		assertEquals(true,tc.pagarBoleto(c3, 1800));
		//paga boleto sin transbordo, misma linea, mismo cole
		assertEquals(true,tc.pagarBoleto(c3, 1840));
		// no paga, se queda sin saldo
		assertEquals(false,tc.pagarBoleto(c5, 1840));
		
		//TARJETA MEDIO BOLETO
		TarjetaMedioBoleto tmb = new TarjetaMedioBoleto(16, 43432);
		//paga el boleto con suficiente saldo
		assertEquals(true,tmb.pagarBoleto(c, 1230));
		//paga el boleto con transbordo
		assertEquals(true,tmb.pagarBoleto(c2, 1315));
		//paga boleto sin transbordo
		assertEquals(true,tmb.pagarBoleto(c3, 1800));
		//paga boleto sin transbordo, misma linea, mismo cole
		assertEquals(true,tmb.pagarBoleto(c3, 1840));
		//paga boleto comun por ser horario fuera del medio boleto
		assertEquals(true,tmb.pagarBoleto(c4, 2450));
		// no paga, se queda sin saldo
		assertEquals(false,tmb.pagarBoleto(c5, 1840));
	}
	
	
}
