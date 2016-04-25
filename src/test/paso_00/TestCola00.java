package test.paso_00;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import paso_00.Cliente;
import paso_00.Cola00;
import paso_00.ColaVacia;
import paso_00.PilaVacia;
import paso_00.Vaca;

/******
 * 
 * @author diegos
 *
 *
 * Cosas a notar:
 *  - Colecciones de Objects
 *  - Si guardamos Objects => debemos verificar tipos a la hora de enviar mensajes
 *  - Opcion 1 - Una Clase coleccion por tipo 
 *    - Hacer el cast dentro de la coleccion
 *    - Perdemos genericidad
 *  - Opcion 2 - Una única clase y guardar object 
 *    - Guardar objetos
 *    - Tenemos que realizar casts 
 * 
 *  
 *  - Necesitaríamos distinguir entre distintas colecciones
 */
public class TestCola00 {
	
	@Test 
	public void testAgregarElementosDeDistintasClases() throws ColaVacia {
		Cola00 cola = new Cola00();
		
		cola.agregar(new Cliente());
		cola.agregar(new Vaca() );
		
		// Necesitamos, sí o sí, distinguir que fue lo que agregamos para poder
		// Enviar mensajes
		//
		// @DIFF
		// Diferencia con smalltalk
		Cliente c = (Cliente)cola.quitar();
		
		// Hacemos algo
		
		Vaca p = (Vaca)cola.quitar();
		
		// Hacemos Otra cosa
		
		// Assert omitido a propósito
		// Analizar Dificultades
	}

	@Test
	public void testAlAgregarUnElementoNoEstaVacia() throws PilaVacia {
		Cola00 cola = new Cola00();
		
		cola.agregar(new Integer(2));
		assertTrue(cola.noEstaVacia());
	}

	@Test
	public void testCuandoSeCreaEstaVacia() throws PilaVacia {
		Cola00 cola = new Cola00();
		assertTrue(cola.estaVacia());
	}

	@Test(expected=ColaVacia.class)
	public void testSiNoHayElementosEnLaPilaDebeLanzarErrorPilaVaciaSiIntentaQuitarElemento() throws ColaVacia {
		Cola00 cola = new Cola00();
		
		cola.quitar();
	}

	@Test
	public void testAlAgregarUnosDatosDebePoderQuitarElPrimerElementoAgregado() throws ColaVacia {
		Cola00 cola = new Cola00();
		
		// Equivalentes
		cola.agregar(new Integer(1));
		cola.agregar(new Integer(2));
		
		assertEquals(cola.quitar(), new Integer(1));
	}
	


}
