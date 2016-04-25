package test.paso_01;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import paso_01.Pila01;

public class TestPila01 {


	@Test
	public void testAlAgregarUnosDatoElIteradorDebeResponderQueHayElementos() {
		Pila01 pila = new Pila01();
		
		Iterator i = pila.iterator();

		pila.apilar(new Integer(1));
		pila.apilar(new Integer(2));
	
		assertTrue(i.hasNext());
	}
	
	@Test
	public void testCuandoTieneVariosElementosIteradorDebeDevolverValoresEnLlamadasSucesivas() {
		Pila01 pila = new Pila01();		
		Iterator i = pila.iterator();
		
		pila.apilar(new Integer(1));
		pila.apilar(new Integer(2));

		assertEquals(i.next(), new Integer(2));
		assertEquals(i.next(), new Integer(1));
	}

}
