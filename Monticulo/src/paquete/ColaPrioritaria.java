package paquete;

public class ColaPrioritaria<T extends Comparable<T>> {
	
	private Monticulo monticulo;
	
	public ColaPrioritaria() {
		this.monticulo = new Monticulo();
	}
	
	public void offer(T dato) {
		this.monticulo.monticulear(dato);
	}
	
	public T poll() {
		return (T) this.monticulo.desmonticulear();
	}
	
	public T peek() {
		return (T) this.monticulo.getPrimerElemento();
	}
	
	public boolean isEmpty() {
		return this.monticulo.isEmpty();
	}
	
	public void empty() {
		this.monticulo.empty();
	}
}
