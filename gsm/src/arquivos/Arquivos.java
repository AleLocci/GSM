package arquivos;

import java.io.File;
import java.util.ArrayList;

public class Arquivos {

    public ArrayList<File> arqLista = new ArrayList<>();

    public void listandoArquivos (File arq) {

        for(File i : arq.listFiles()) {

            if(i.isFile()) {

                if(i.getName().endsWith(".cpp") || i.getName().endsWith(".java") || i.getName().endsWith(".c")
                        || i.getName().endsWith(".h") || i.getName().endsWith(".cs")) {

                        arqLista.add(i);

                }

            } else {

                listandoArquivos(i);

            }
        }
    }
}
