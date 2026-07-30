package screenmatch;

import screenmatch.br.com.alura.screematch.modelos.Filme;

public class exercicio {
    public static void main(String[] args) {
        Filme meufilme2 = new Filme();

        meufilme2.nome = "Poderoso chefinho";
        meufilme2.anoDeLancamento = 2015;
        meufilme2.avalia(9);
        meufilme2.avalia(2);
        meufilme2.avalia(5);

        System.out.println(
            String.format("O %s é um filme de %d e que tem um total de %d avaliações, com média %.2f", meufilme2.nome, meufilme2.anoDeLancamento, meufilme2.totalDeAvaliacoes, meufilme2.pegaMedia())
        );
    }
}
