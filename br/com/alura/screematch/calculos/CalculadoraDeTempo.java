package Screenmatch.br.com.alura.screematch.calculos;

import Screenmatch.br.com.alura.screematch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    // public void inclui(Filme f){
    //     tempoTotal += f.getDuracaoEmMinutos();
    // }

    // public void inclui(Serie s){
    //     tempoTotal += s.getDuracaoEmMinutos();
    // }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de: "+  titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    } // Polimorfismo
    
}
