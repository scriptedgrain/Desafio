package Etapa2;

public class Candidato {
    String nome;
    String partido;
    int intencoesVotos;
    
    public Candidato(String nome, String partido, int intencoesVotos) {
        this.nome = nome;
        this.partido = partido;
        this.intencoesVotos = intencoesVotos;
    }
    public Candidato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getIntencoesVotos() {
        return intencoesVotos;
    }

    public void setIntencoesVotos(int intencoesVotos) {
        this.intencoesVotos = intencoesVotos;
    }

    @Override
    public String toString() {
        return "\n                        **Candidato**\n nome = " + nome + ", partido = " + partido + ", intencoesVotos = " + intencoesVotos;
    }
}