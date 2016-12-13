package mx.redigital.canbook2;

import java.util.ArrayList;

/**
 * Created by jcarlosmarqz on 12/13/16.
 */

public class Mascota {
    private String nombre;
    private int foto;
    private int ranking;

    ArrayList<Mascota> favorito = new ArrayList<Mascota>();

    public Mascota(String nombre, int foto, int ranking){
        this.nombre = nombre;
        this.foto= foto;
        this.ranking= ranking;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getFoto(){
        return foto;
    }

    public void setFoto(int foto){
        this.foto = foto;
    }
    public int getRanking(){
        return ranking;
    }
    public void setRanking(int ranking){
        this.ranking = ranking + this.ranking;
    }

    public void mascotasFavoritas(String nombre, int foto, int ranking){
        if(favorito.size()<5){
            favorito.add(new Mascota(nombre, foto, ranking));
        } else {
            favorito.set(0,new Mascota(nombre, foto, ranking));
        }


    }


}