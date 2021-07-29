
public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("Abrindo Conexão");
		throw new IllegalStateException();
	}
	
	public void LeDados() {
		System.out.println("Recebendo dados...");
		throw new IllegalStateException();
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Fechando conexão...");

	}

}
