package test.paso_02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

import paso_02.Cola02;

public class TestCola02 {


	@Test
	public void testAlAgregarUnosDatoElIteradorDebeResponderQueHayElementos() {
		Cola02<Integer> cola = new Cola02<Integer>();
		
		Iterator<Integer> i = cola.iterator();

		cola.agregar(new Integer(1));
		cola.agregar(new Integer(2));
	
		assertTrue(i.hasNext());
	}
	
	@Test
	public void testCuandoTieneVariosElementosIteradorDebeDevolverValoresEnLlamadasSucesivas() {
		Cola02<Integer> cola = new Cola02<Integer>();
		Iterator<Integer> i = cola.iterator();
		
		cola.agregar(new Integer(1));
		cola.agregar(new Integer(2));
		
		assertEquals(i.next(), new Integer(1));
		assertEquals(i.next(), new Integer(2));
	}
	
}
