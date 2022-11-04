public class BMEX05 {
    
    String nomeTime;
    String localJogo;
    String dataJogo;
    int vitorias = 0;
    int derrotas = 0;
    int empates = 0;
    
    
    public String verTime() {
        return nomeTime;
    }
    
    public String verLocalJogo() {
        return localJogo;
    }

    public String dataJogo() {
        return dataJogo;
    }
    
    public void ganhar() {
        vitorias++;
    }

    public void perder() {
        derrotas++;
    }

    public void empatar() {
        empates++;
    }

    public int pontuacao() {
        return vitorias * 3 + empates;
    }

    public String resultado() {
        return "Vitórias: " + vitorias + ", Empates: " + empates + ", Derrotas: " + derrotas;
    }




}

