package br.com.alura.java.io.teste;

import java.io.*;

public class testeCopiarArquivo {

    public static void main(String[] args) throws IOException {
    
        String loremtxt= "C:/Users/marti/eclipse-workspace-java/java-io/lorem.txt";
       // String lorem2txt= "C:/Users/marti/eclipse-workspace-java/java-io/lorem2.txt";

        InputStream fis = new FileInputStream("C:/Users/marti/eclipse-workspace-java/java-io/lorem.txt");//System.in; //
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("C:/Users/marti/eclipse-workspace-java/java-io/lorem2.txt");//System.out;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();
        System.out.println(linha!=null);
        System.out.println(linha.isEmpty());

        while(linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }


        bw.close();
        br.close();
        System.out.println("Finalizado.");
    }
}
