import arquivos.Arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Arquivos arq = new Arquivos();
        File fonte = new File("/home/ncc1701/Documents/fprime/");
        arq.listandoArquivos(fonte);
        System.out.println("Número de arquivos para serem analisados: " + arq.arqLista.size());

        String cmd = "srcml " + arq.arqLista.get(1).getAbsolutePath();
        Runtime run = Runtime.getRuntime();
        Process pr = null;
        try {

            pr = run.exec(cmd);
            pr.waitFor();

            BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line = "";
            while ((line=buf.readLine())!=null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }


    }

}
