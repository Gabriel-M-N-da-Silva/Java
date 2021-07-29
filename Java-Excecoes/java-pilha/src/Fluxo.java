
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do Main");
		try {
		metodo1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do Main");
	}

	private static void metodo1() {
		System.out.println("Ini do m1");
		metodo2();
		System.out.println("Fim do m1");
		
	}

	private static void metodo2() {
		System.out.println("Ini do m2");
		throw new NullPointerException("Erro");
	
		
	}

}
