package Screenmatch;

import Screenmatch.br.com.alura.screematch.modelos.Episodio;
import Screenmatch.br.com.alura.screematch.modelos.Filme;

import Screenmatch.br.com.alura.screematch.modelos.Serie;
import Screenmatch.br.com.alura.screematch.calculos.CalculadoraDeTempo;
import Screenmatch.br.com.alura.screematch.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        
        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println(("Duração do filme: "+ meuFilme.getDuracaoEmMinutos()));
        
        meuFilme.exibeFichaTecnica();
        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println(lost.getTemporadas());
        System.out.println(("Duração para maratonar Lost: "+ lost.getDuracaoEmMinutos()));
        
        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme); 
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());  
        
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        meuFilme.getTotalDeAvaliacoes();
        meuFilme.pegaMedia();

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


    }
}

