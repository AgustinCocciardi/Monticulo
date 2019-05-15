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
		monticulo.monticulear(17.5);
		Assert.assertEquals(17.5, monticulo.getPrimerElemento(), 0.1);
	}
	
	@Test
	public void queAgregaYOrdena() {
		monticulo.monticulear(17.5);
		monticulo.monticulear(6.0);
		monticulo.monticulear(4.75);
		monticulo.monticulear(1.12);
		Assert.assertEquals(1.12, monticulo.getPrimerElemento(), 0.1);
	}
	
	@Test
	public void queEliminaElPrimero() {
		monticulo.monticulear(17.5);
		monticulo.monticulear(6.0);
		monticulo.monticulear(4.75);
		monticulo.monticulear(1.12);
		Assert.assertEquals(1.12, monticulo.desmonticulear(), 0.1);
	}
	
	@Test
	public void queEliminaSinProblemas() {
		monticulo.monticulear(17.5);
		monticulo.monticulear(6.0);
		monticulo.monticulear(4.75);
		monticulo.monticulear(1.12);
		Assert.assertEquals(1.12, monticulo.desmonticulear(), 0.1);
		Assert.assertEquals(4.75, monticulo.desmonticulear(), 0.1);
		Assert.assertEquals(6.0, monticulo.desmonticulear(), 0.1);
		Assert.assertEquals(17.5, monticulo.desmonticulear(), 0.1);
	}
}
