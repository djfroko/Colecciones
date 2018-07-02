package com.cice.claves;

import java.util.HashMap;
import java.util.Hashtable;

public class ColeccionesBasadasEnClaves {


    public static void main(String[] args) {

        //Basadas en claves
        //hastable o hashmap

        Hashtable<String, String> listaPersonas = new Hashtable<>();

        HashMap<String, String> listaNombres = new HashMap<>();

        //1º HASTABLE
        listaPersonas.put("profesor", "gustavo");
        listaPersonas.put("alumno","Jose Mari");
        listaPersonas.put("alumna", "Ana");

        String profesor = listaPersonas.get("profesor");

        System.out.println(profesor);

        listaPersonas.contains("gustavo");// true en caso de existir el value dentro de la coleccion.
        listaPersonas.containsKey("profesor");








    }
}
