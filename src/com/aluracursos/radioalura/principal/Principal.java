package com.aluracursos.radioalura.principal;

import com.aluracursos.aludaradio.modelos.Cancion;
import com.aluracursos.aludaradio.modelos.MisFavoritos;
import com.aluracursos.aludaradio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever -");
        miCancion.setCantante("Kiss -");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar -");
        miPodcast.setTitulo("Cafe.tech -");

        //cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        //Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.agrega(miPodcast);
        favoritos.agrega(miCancion);


    }
}
