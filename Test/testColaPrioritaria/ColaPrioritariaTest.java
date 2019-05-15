package testColaPrioritaria;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import paquete.*;

public class ColaPrioritariaTest {
	
	public ColaPrioritaria<Double> cola;
	
	@Before
	public void constructor() {
		this.cola = new ColaPrioritaria<Double>();
	}
	
	@Test
	public void quePuedeAgregar() {
		cola.offer(17.5);
		Assert.assertEquals(17.5, cola.peek(), 0.1);
	}
	
	@Test 
	public void queAgregaYOrdena() {
		cola.offer(17.5);
		cola.offer(6.0);
		cola.offer(4.75);
		cola.offer(1.12);
		Assert.assertEquals(1.12, cola.peek(), 0.1);;
	}
	
	@Test
	public void queEliminaElPrimero() {
		cola.offer(17.5);
		cola.offer(6.0);
		cola.offer(4.75);
		cola.offer(1.12);
		Assert.assertEquals(1.12, cola.poll(), 0.1);
	}
	
	@Test
	public void queEliminaSinProblemas() {
		cola.offer(17.5);
		cola.offer(6.0);
		cola.offer(4.75);
		cola.offer(1.12);
		Assert.assertEquals(1.12, cola.poll(), 0.1);
		Assert.assertEquals(4.75, cola.poll(), 0.1);
		Assert.assertEquals(6.0,  cola.poll(), 0.1);
		Assert.assertEquals(17.5, cola.poll(), 0.1);
	}
	
}
