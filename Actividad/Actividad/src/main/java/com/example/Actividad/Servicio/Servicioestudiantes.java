package com.example.Actividad.Servicio;

import com.example.Actividad.Entidades.Estidiantes;

import java.util.ArrayList;

public class Servicioestudiantes {
    ArrayList<Estidiantes>lista = new ArrayList<>();

    public Servicioestudiantes(){
        lista.add(new Estidiantes(1,"Primero","Camilo","Diaz",new String[]{"Español","Socailes","Religion"},new float[]{4.5f,3.5f,4.0f}));
        lista.add(new Estidiantes(2,"Caurto","Luis","Basques",new String[]{"Matematicas","Socailes","Español"},new float[]{4.5f,3.5f,4.0f}));
        lista.add(new Estidiantes(3,"Primero","Pedro","Rodrigez",new String[]{"Español","Socailes","Religion"},new float[]{4.5f,3.5f,4.0f}));
        lista.add(new Estidiantes(4,"Quinto","Pepe","Rojas",new String[]{"Religion","Socailes","Filosofia"},new float[]{4.5f,3.5f,4.0f}));
        lista.add(new Estidiantes(5,"Cuarto","Camila","Forero",new String[]{"Emprendimiento","MAtematicas","Religion"},new float[]{4.5f,3.5f,4.0f}));
        lista.add(new Estidiantes(6,"Decimo","Sergio","Diaz",new String[]{"Fisica","Socailes","Geografia"},new float[]{4.5f,3.5f,4.0f}));
        lista.add(new Estidiantes(7,"Decimo","Felipe","Oliveros",new String[]{"Geometria","Socailes","Geometria"},new float[]{4.5f,3.5f,4.0f}));
        lista.add(new Estidiantes(8,"Primero","Julian","Martinez",new String[]{"Artes","Socailes","Religion"},new float[]{4.5f,3.5f,4.0f}));
        lista.add(new Estidiantes(9,"Tercero","Juancho","Rocha",new String[]{"Español","Socailes","filosofia"},new float[]{4.5f,3.5f,4.0f}));
        lista.add(new Estidiantes(10,"Primero","Luisa","Panagos",new String[]{"Español","Socailes","Religion"},new float[]{4.5f,3.5f,4.0f}));

    }
public ArrayList<Estidiantes>listar(){
        return lista;
}

public ArrayList<Estidiantes>buscar(String curso){
        ArrayList<Estidiantes> listascurso= new ArrayList<>();

        for(Estidiantes x: lista ){
            if (x.getCurso().equals(curso)){
                listascurso.add(x);
            }
        }
        return listascurso;
}

public String agregar(Estidiantes estudiante){
        lista.add(estudiante);
        return "Se ingresos un estudiantes";
}

}
