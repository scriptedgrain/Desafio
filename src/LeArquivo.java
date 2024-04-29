import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo {
    public static void main(String args[]) {
        String filename = "F:\\Usuários\\delta\\Área de Trabalho\\Lucca\\Faculdade ADS\\3°Semestre\\Laboratório II\\Labirinto.txt";
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader in = new BufferedReader(fr);
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo \""+filename+" \" não existe.");
        }
        catch (IOException e) {
            System.out.println("Erro na leitura de " + filename+ ".");
        }
    }
}
