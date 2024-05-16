public class Main {
    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
        char[][] labirintoArray = labirinto.criaLabirinto();
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
