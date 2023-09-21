package javastrategy.gof;

public class comportamentodefensivo implements comportamento {
	
	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
	}
}
