package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		
		Conta c1 = new ContaPoupanca(11,11);
		Conta c2 = new ContaPoupanca(22,22);
		Conta c3 = new ContaPoupanca(33,33);
		
		GuardadorDeContas Gc = new GuardadorDeContas();
		
		Gc.guardadorDeContas();
		Gc.adiciona(c1);
		Gc.adiciona(c2);
		Gc.adiciona(c3);
		
		System.out.println(Gc.getQuantidadeDeElementos());
		System.out.println(Gc.getReferencia(0));
		System.out.println(Gc.getReferencia(1));
		System.out.println(Gc.getReferencia(2));
		
		

	}

}
