import java.io.*;

public class Labirinto {
    private char[][] labirinto;
    
    public char[][] criaLabirinto() {
        String filename = "F:\\Usuários\\delta\\Área de Trabalho\\Lucca\\Faculdade ADS\\3°Semestre\\Laboratório II\\Labirinto.txt";
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader in = new BufferedReader(fr);
            String line = in.readLine();
            int linhas = 0;
            while (line != null) {
                char[] linhaArray = line.toCharArray();
                char[] linhaFormatada = new char[linhaArray.length];
                for (int i = 0; i < linhaArray.length; i++) {
                    if (linhaArray[i] == 'X') {
                        linhaFormatada[i] = ' ';
                    } else if (linhaArray[i] == ' ') {
                        linhaFormatada[i] = (i == 0 || linhaArray[i - 1] != ' ') ? ' ' : '\0';
                    } else {
                        linhaFormatada[i] = linhaArray[i];
                    }
                }
                if (labirinto == null) {
                    labirinto = new char[1][linhaArray.length];
                } else {
                    char[][] novoLabirinto = new char[linhas + 1][linhaArray.length];
                    for (int i = 0; i < linhas; i++) {
                        novoLabirinto[i] = labirinto[i];
                    }
                    labirinto = novoLabirinto;
                }
                labirinto[linhas] = linhaFormatada;
                line = in.readLine();
                linhas++;
            }
            in.close();
            return labirinto;
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo \""+filename+" \" não existe.");
        }
        catch (IOException e) {
            System.out.println("Erro na leitura de " + filename+ ".");
        }
        return null;
    }
    public percorreLabirinto() {

    }
    private percorreLabirinto() {

    }
}
