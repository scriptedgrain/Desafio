package Etapa1;
public class Main {
    public static void main(String[] args) {

        String filename = "F:\\Usuários\\delta\\Área de Trabalho\\Lucca\\Faculdade ADS\\3°Semestre\\Laboratório II\\Desafio\\Desafio-GR96004-00055-LuccaMaiaRosa\\src\\Etapa1\\Labirinto.txt";
        Labirinto labirinto = new Labirinto();
        char[][] labirintoArray = labirinto.criaLabirinto(filename);
        boolean percorreCaminho = labirinto.percorreLabirinto();
            
        if (labirintoArray != null) {
            System.out.println("Labirinto criado com sucesso:");
            imprimirLabirinto(labirintoArray);
        } 
        else
            System.out.println("Não foi possível criar o labirinto.");
        
        if (percorreCaminho == true)
            System.out.println("\nO labirinto possui uma saída!");
        else
            System.out.println("\nNão há saída para o labirinto!");
    }

    public static void imprimirLabirinto(char[][] labirinto) {
        for (char[] linha : labirinto) {
            for (char caractere : linha) {
                System.out.print((caractere == '\0') ? " " : caractere + " ");
            }
            System.out.println();
        }
    }
}
