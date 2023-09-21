package javastrategy.gof;


public class Teste {

	public static void main(String[] args) {
				
				//Strategy
				comportamento normal = new Comportamentonormal();
				comportamento agressivo = new comportamentoagressivo();
				comportamento defensivo = new comportamentodefensivo();
				
				Robo robo = new Robo();
				robo.setcomportamento(normal);
				robo.mover();
				robo.mover();
				robo.setcomportamento(defensivo);
				robo.mover();
				robo.mover();
				robo.setcomportamento(agressivo);
				robo.mover();
				robo.mover();
				robo.mover();
				

	}

}
