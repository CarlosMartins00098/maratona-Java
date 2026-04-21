package com.mycompany.maratona.java.introducao.javacore.Csobrecargametodos.test;

import com.mycompany.maratona.java.introducao.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12,"Ação");
        /*
        anime.setNome("Akudama Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.setGenero("Ação");
        */
        anime.imprime();
        
        
    }
}
