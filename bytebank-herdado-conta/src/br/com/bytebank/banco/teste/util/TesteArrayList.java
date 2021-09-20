package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
//		Cliente c0 = new Cliente();
		Conta c1 = new ContaPoupanca(11,11);
		Conta c2 = new ContaPoupanca(22,22);
		Conta c3 = new ContaPoupanca(33,33);
		
//		lista.add(c0);
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
//		for(int i = 0; i < lista.size(); i++) {
//			Object oRef = lista.get(i);
//			System.out.println();
//		}
		
		for (Object oRef : lista) {
			System.out.println(oRef);
		}

	}

}
