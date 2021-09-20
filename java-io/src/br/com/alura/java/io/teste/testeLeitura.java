package br.com.alura.java.io.teste;

import java.io.*;

public class testeLeitura {
    
    public static void main (String[] args) throws IOException {
        
        String loremtxt= "C:/Users/marti/eclipse-workspace-java/java-io/lorem.txt";

        //Fluxo de entrada de arquivo
        FileInputStream fis = new FileInputStream(loremtxt);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }

}
