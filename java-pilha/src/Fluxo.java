
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do Main");
		metodo1();
		System.out.println("Fim do Main");
	}

	private static void metodo1() {
		System.out.println("Ini do m1");
		metodo2();
		System.out.println("Fim do m1");
		
	}

	private static void metodo2() {
		System.out.println("Ini do m2");
		
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("Fim do m2");
		
	}

}
