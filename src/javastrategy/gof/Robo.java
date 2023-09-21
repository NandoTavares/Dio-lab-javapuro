package javastrategy.gof;

public class Robo {
	
	private comportamento comportamento;
	public void setcomportamento(comportamento comportamento) {
		this.comportamento = comportamento;
	}
	public void mover() {
		comportamento.mover();
	}
}
