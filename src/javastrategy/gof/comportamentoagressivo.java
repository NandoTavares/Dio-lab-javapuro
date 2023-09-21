package javastrategy.gof;

public class comportamentoagressivo implements comportamento {
	
	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}
}
