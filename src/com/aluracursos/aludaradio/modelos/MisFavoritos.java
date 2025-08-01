package com.aluracursos.aludaradio.modelos;

public class MisFavoritos {
    public void agrega (Audio audio){
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " Top del momento ");
        } else {
            System.out.println(audio.getTitulo() + " Favoritos recientes");
        }
    }
}
