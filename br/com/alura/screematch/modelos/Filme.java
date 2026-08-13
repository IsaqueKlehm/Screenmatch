package Screenmatch.br.com.alura.screematch.modelos;

import Screenmatch.br.com.alura.screematch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }

    

}
