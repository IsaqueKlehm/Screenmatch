package Screenmatch;

import Screenmatch.br.com.alura.screematch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        

        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        
        meuFilme.exibeFichaTecnica();
        // meuFilme.avalia(8);
        // meuFilme.avalia(5);
        // meuFilme.avalia(10);

        // System.out.println("Total de avaliação: "+ meuFilme.getTotalDeAvaliacoes());
        // System.out.println(meuFilme.pegaMedia()); 
        // System.out.println("Total das somas de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        
        // System.out.println(meuFilme.getNome());
        // System.out.println(meuFilme.getIncluidoNoPlano());
    }
}

