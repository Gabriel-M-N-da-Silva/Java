
public class Gerente extends Funcionario implements Autenticavel {
	
	public AutenticacaoUtil autenticador;
	
	public void Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		return super.getSalario();
	}

}
