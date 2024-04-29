import java.io.*;
public class EscreveArquivo {
    public static void main(String args[]) {
        try {
            File f = new File ("F:\\Usuários\\delta\\Área de Trabalho\\Lucca\\Faculdade ADS\\3°Semestre\\Laboratório II\\Labirinto.txt");
            FileWriter fr = new FileWriter (f);
            PrintWriter out = new PrintWriter(fr);
            out.println("{' ','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},");
            out.println("{' ',' ',' ',' ',' ',' ',' ',' ','X','X','X','X','X','X','X','X','X','X'},");
            out.println("{'X','X','X',' ','X',' ','X',' ','X','X','X',' ',' ',' ',' ','X','X','X'},");
            out.println("{'X','X','X','X',' ',' ','X',' ','X','X','X',' ','X','X',' ','X','X','X'},");
            out.println("{'X','X','X','X','X','X','X',' ','X','X','X',' ','X','X',' ',' ','X','X'},");
            out.println("{'X','X','X','X','X','X','X',' ',' ',' ',' ',' ','X',' ','X',' ','X','X'},");
            out.println("{'X','X','X','X','X','X','X','X',' ','X','X',' ','X',' ',' ',' ',' ','X'},");
            out.println("{'X','X','X','X','X','X','X','X',' ',' ',' ',' ','X',' ',' ','X',' ','D'},");
            out.println("{'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'}");
            out.close();
        }
        catch (IOException e) {
            System.out.println ("Erro ao escrever arquivo.");
        }
    }
}
