package javasingleton.gof;

public class Test {

	public static void main(String[] args) {
		//Teste relacionados ao design pattern Singleton:
		SingletonLazy lazy = SingletonLazy.getInstancia();
				System.out.println(lazy);
				lazy = SingletonLazy.getInstancia();
				System.out.println(lazy);
				
				SingletonEager eager = SingletonEager.getInstancia();
				System.out.println(eager);
				eager = SingletonEager.getInstancia();
				System.out.println(eager);
				
				SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
				System.out.println(lazyHolder);
				lazyHolder = SingletonLazyHolder.getInstancia();
				System.out.println(lazyHolder);
				
				//facade 
				
				

	}

}
