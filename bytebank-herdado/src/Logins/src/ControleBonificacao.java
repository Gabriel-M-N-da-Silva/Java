
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += 1;
	}
	
	public double getSoma() {
		return soma;
	}
	
}
