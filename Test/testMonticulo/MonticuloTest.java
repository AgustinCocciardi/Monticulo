package testMonticulo;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import paquete.*;

public class MonticuloTest {
	
	public Monticulo<Double> monticulo;
	
	@Before
	public void constructor()
	{
		monticulo = new Monticulo<Double>();
	}
	
	@Test
	public void quePuedeAgregar() {
		monticulo.insertar(17.5);
		Assert.assertEquals(17.5, monticulo.getPrimerElemento(), 0.1);
	}
	
	@Test
	public void queAgregaYOrdena() {
		monticulo.insertar(17.5);
		monticulo.insertar(6.0);
		monticulo.insertar(4.75);
		monticulo.insertar(1.12);
		Assert.assertEquals(1.12, monticulo.getPrimerElemento(), 0.1);
	}
	
	@Test
	public void queEliminaElPrimero() {
		monticulo.insertar(17.5);
		monticulo.insertar(6.0);
		monticulo.insertar(4.75);
		monticulo.insertar(1.12);
		Assert.assertEquals(1.12, monticulo.sacar(), 0.1);
	}
	
	@Test
	public void queEliminaSinProblemas() {
		monticulo.insertar(17.5);
		monticulo.insertar(6.0);
		monticulo.insertar(4.75);
		monticulo.insertar(1.12);
		Assert.assertEquals(1.12, monticulo.sacar(), 0.1);
		Assert.assertEquals(4.75, monticulo.sacar(), 0.1);
		Assert.assertEquals(6.0, monticulo.sacar(), 0.1);
		Assert.assertEquals(17.5, monticulo.sacar(), 0.1);
	}
}
