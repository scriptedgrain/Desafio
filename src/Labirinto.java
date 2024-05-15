import java.io.*;

public class Labirinto {
    private char[][] labirinto;

    public char[][] criaLabirinto() {
        String filename = "F:\\Usuários\\delta\\Área de Trabalho\\Lucca\\Faculdade ADS\\3°Semestre\\Laboratório II\\Labirinto.txt";
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader in = new BufferedReader(fr);
            String line = in.readLine();
            String[] colunas = line.split("\\,");
            int numColunas = colunas.length;
            int numLinhas = 0;
            while(line != null) {
                numLinhas++;
                line = in.readLine();
            }
            in.close();
            FileReader fr2 = new FileReader(filename);
            BufferedReader in2 = new BufferedReader(fr2);
            labirinto = new char[numLinhas][numColunas];
            for (int i = 0; i < numLinhas; i++) {
                line = in2.readLine();
                line = line.replaceAll(",",""); 
                for (int j = 0; j < numColunas; j++) {
                    labirinto[i][j] = line.charAt(j);
                }
            }
            in2.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo \""+filename+" \" não existe.");
        }
        catch (IOException e) {
            System.out.println("Erro na leitura de " + filename+ ".");
        }
        return labirinto;
    }
    public percorreLabirinto() {

    }
    private percorreLabirinto() {

    }
}
