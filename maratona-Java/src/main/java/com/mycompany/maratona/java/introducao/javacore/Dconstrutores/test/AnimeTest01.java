package com.mycompany.maratona.java.introducao.javacore.Dconstrutores.test;

import com.mycompany.maratona.java.introducao.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12,"Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
        
        
    }
}
