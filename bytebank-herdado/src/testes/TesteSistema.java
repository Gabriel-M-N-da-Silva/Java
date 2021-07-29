
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Mike");
		g.setSenha(1234);
		
		Administrador adm = new Administrador();
		adm.setNome("Nico");
		adm.setSenha(1234);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);

	}

}
