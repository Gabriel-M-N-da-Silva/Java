package br.com.alura.java.io.teste;

import java.io.*;



public class testeEscrita {
    public static void main(String[] args) throws IOException {

        String loremtxt= "C:/Users/marti/eclipse-workspace-java/java-io/lorem2.txt";

        //Fluxo de saída de arquivo
        FileOutputStream fos = new FileOutputStream(loremtxt);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");


        bw.close();

    }
}
