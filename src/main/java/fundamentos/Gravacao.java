package fundamentos;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gravacao {

    public static void main (String [] args) throws IOException {
        String[] cabecalho = {"nome","idade","telefone"};

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"Beatriz", "29", "41 999166021"});
        linhas.add(new String[]{"Gilmo", "25", "41 999163456"});
        linhas.add(new String[]{"Silas", "25", "41 77777777"});

        Writer escritor = Files.newBufferedWriter(Paths.get("src/main/resources/logs/clientes.csv"));

        CSVWriter escritorCSV = new CSVWriter(escritor);

        escritorCSV.writeNext(cabecalho);
        escritorCSV.writeAll(linhas);
        // aqui que ele gera o arquivo (flush)
        escritorCSV.flush();

        //para fechar o arquivo
        escritor.close();


    }
}
