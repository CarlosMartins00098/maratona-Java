package com.mycompany.maratona.java.introducao.javacore.Eblocosinicializacao.test;

import com.mycompany.maratona.java.introducao.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one piece");
        
        for (int episodio :anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }
    }
}
