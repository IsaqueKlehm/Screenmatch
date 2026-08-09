package Screenmatch.br.com.alura.screematch.calculos;

import Screenmatch.br.com.alura.screematch.modelos.Filme;
import Screenmatch.br.com.alura.screematch.modelos.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    }
    
}
