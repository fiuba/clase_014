package test.paso_01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

import paso_01.Cola01;

public class TestCola01 {


	@Test
	public void testAlAgregarUnosDatoElIteradorDebeResponderQueHayElementos() {
		Cola01 cola = new Cola01();
		
		Iterator i = cola.iterator();

		cola.agregar(new Integer(1));
		cola.agregar(new Integer(2));
	
		assertTrue(i.hasNext());
	}
	
	@Test
	public void testCuandoTieneVariosElementosIteradorDebeDevolverValoresEnLlamadasSucesivas() {
		Cola01 cola = new Cola01();		
		Iterator i = cola.iterator();
		
		cola.agregar(new Integer(1));
		cola.agregar(new Integer(2));

		assertEquals(i.next(), new Integer(1));
		assertEquals(i.next(), new Integer(2));
	}

}
