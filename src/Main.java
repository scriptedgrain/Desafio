public class Main {
    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
        char[][] labirintoArray = labirinto.criaLabirinto();
        
        if (labirintoArray != null) {
            System.out.println("Labirinto criado com sucesso:");
            imprimirLabirinto(labirintoArray);
        } else {
            System.out.println("Não foi possível criar o labirinto.");
        }
    }
    
    public static void imprimirLabirinto(char[][] labirinto) {
        for (char[] linha : labirinto) {
            for (char caractere : linha) {
                System.out.print((caractere == '\0') ? " " : caractere + " "); // Adiciona um único espaço para os caracteres vazios
            }
            System.out.println();
        }
    }
}
