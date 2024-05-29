package Etapa2;

import java.util.Random;
import java.util.Scanner;

public class PrincipalCandidatos {
    public static void main(String[] args) {
        Random gerador = new Random();
        int quantCandidatos = gerador.nextInt(101);
        
        Candidato [] candidatos = new Candidato[quantCandidatos];
        preencheCandidatos(candidatos);
        System.out.println("Número de candidatos = "+ quantCandidatos +"\nCandidatos:");
        imprimeCandidatosOrdenados(candidatos);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do político: ");
        String politico = sc.next();
        pesquisaBinariaCandidatos(candidatos, politico);
        if(pesquisaBinariaCandidatos(candidatos, politico) == null)
            System.out.println("Político não encontrado! Realizar outra busca");
        else {
            for(int i = 0; i < candidatos.length; i++) {
                if (candidatos[i].getNome().equalsIgnoreCase(politico)) {
                    Candidato c = candidatos[i];
                    System.out.println("Dados do político " + politico + ": " + c);
                    break;
                }
            }
        }
        sc.close();
    }
    private static int intencoesVoto(int min, int max) {
        return (((int) (Math.random() * (max - min))) + min);
    }
    private static String escolhePartido() {
        String[] partidos = {"MDB", "PT", "PRD", "PP", "PSDB", "PDT", "União Brasil", "PL", "PODE", "PSB",
        "Republicanos", "PSD", "Cidadania", "PCdoB", "Solidariedade", "PV", "PSOL", "Avante", "MOBILIZA", "Agir",
        "DC", "PRTB", "NOVO", "PMB", "REDE", "PSTU", "PCB", "UP", "UNIÃO"};
        Random random = new Random();
        int i = random.nextInt(partidos.length);
        String partido = partidos[i];
        return partido;
    }
    private static String escolheNome() {
        String[] nomesAleatorios = {"Cássia", "Lucca", "Davi", "Alice", "Arthur", "Julia", "Pedro", "Isabella", "Gabriel", "Manuela",
            "Bernardo", "Laura", "Lucas", "Luiza", "Matheus", "Valentina", "Rafael", "Giovanna", "Heitor", "Maria",
            "Enzo", "Ana", "Lorenzo", "Helena", "Gustavo", "Mariana", "Felipe", "Lara", "Nicolas", "Beatriz",
            "Guilherme", "Clara", "Leonardo", "Cecília", "Eduardo", "Eloá", "Henrique", "Lívia", "João", "Antonella",
            "Vitor", "Rebeca", "Luiz", "Esther", "Francisco", "Sarah", "Murilo", "Elisa", "Erick", "Leticia",
            "Ian", "Gabriela", "Vinicius", "Isadora", "Breno", "Melissa", "Caio", "Yasmin", "Bruno", "Lorena",
            "Carlos", "Luna", "Rodrigo", "Amanda", "Daniel", "Alana", "Fernando", "Aurora", "Mateus", "Isabel",
            "Thiago", "Olivia", "Antonio", "Marina", "Adrian", "Nicole", "Cauã", "Emilly", "Henrique", "Lavínia",
            "Lucas", "Vitória", "Diego", "Bianca", "Diogo", "Catarina", "Leonardo", "Larissa", "Ricardo", "Mirella",
            "André", "Stella", "José", "Heloísa", "Luan", "Carolina", "Renan", "Agatha", "Thales", "Rayssa"};
        Random random = new Random();
        int i = random.nextInt(nomesAleatorios.length);
        String nome = nomesAleatorios[i];        
        return nome;
    }
    public static void preencheCandidatos(Candidato [] candidatos) {
        for(int i = 0; i < candidatos.length; i++) {
            Candidato candidato = new Candidato(escolheNome(), escolhePartido(), intencoesVoto(500, 50001));
            candidatos [i] = candidato;
        }
    }
    private static void ordenaCandidatosPorNome(Candidato [] candidatos) {
		int min = 0;
		for (int i = 0; i < candidatos.length-1; i++) {
			min = i; 
			for (int j = i+1; j < candidatos.length; j++)
				if (candidatos[j].getNome().compareTo(candidatos[min].getNome()) < 0)
					min = j;
			Candidato T = candidatos[i]; 
			candidatos[i] = candidatos[min]; 
			candidatos[min] = T;
		}
	}
    private static void ordenaCandidatosPorVotos(Candidato [] candidatos) {
		int min = 0;
		for (int i = 0; i < candidatos.length-1; i++) {
			min = i;
			for (int j = i+1; j < candidatos.length; j++)
				if (candidatos[j].getIntencoesVotos() < (candidatos[min].getIntencoesVotos()))
					min = j;
			Candidato T = candidatos[i];
			candidatos[i] = candidatos[min];
			candidatos[min] = T;
		}
	}
    private static void ordenaCandidatosPorPartido(Candidato [] candidatos) {
		int min = 0;
		for (int i = 0; i < candidatos.length-1; i++) {
			min = i;
			for (int j = i+1; j < candidatos.length; j++)
				if (candidatos[j].getPartido().compareTo(candidatos[min].getPartido()) < 0)
					min = j;
			Candidato T = candidatos[i];
			candidatos[i] = candidatos[min];
			candidatos[min] = T;
		}
	}
    public static void imprimeCandidatosOrdenados(Candidato [] candidatos) {
        int min = 0;
        for(int i = 0; i < candidatos.length-1; i++) {
            ordenaCandidatosPorNome(candidatos);
            min = i;
            for(int j = i+1; j < candidatos.length; j++) {
                if(candidatos[j].getNome().equalsIgnoreCase(candidatos[min].getNome()))
                    ordenaCandidatosPorVotos(candidatos);
                if(candidatos[j].getIntencoesVotos() == candidatos[min].getIntencoesVotos())
                    ordenaCandidatosPorPartido(candidatos);   
            }
        }
        for(Candidato candidato : candidatos)
            System.out.println(candidato);
    }
    public static String pesquisaBinariaCandidatos(Candidato [] candidatos, String nome) {
        int inf = 0; int sup = candidatos.length - 1;
		while (inf <= sup) {
				int med = (inf + sup) / 2;
                int comparacao = nome.compareToIgnoreCase(candidatos[med].getNome());
				if (comparacao == 0)
					return candidatos[med].getNome();
				else if (comparacao < 0)
					sup = med - 1;
				else
					inf = med + 1;
		}
		return null;
    }
}						
                    
