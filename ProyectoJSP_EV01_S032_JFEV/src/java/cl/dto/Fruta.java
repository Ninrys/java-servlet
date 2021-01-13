/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dto;

import java.util.ArrayList;

/**
 *
 * @author Ninry
 */
public class Fruta {
    private String nombre;
    private double precio;
    
    private static ArrayList<Fruta>listaFruta =new ArrayList<>();

    public Fruta() {
    }
 
    public Fruta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      
    
    public static ArrayList<Fruta> getLista() {
        Fruta Frutilla= new Fruta("Frutilla",300);
    Fruta Durazno= new Fruta("Durazno",350);
    Fruta Frambuesa= new Fruta("Frambuesa",400);
    Fruta Lichi= new Fruta("Lichi", 450);
    Fruta Mango= new Fruta("Mango", 500);
    Fruta Manzana= new Fruta("Manzana",530);
    Fruta Mora= new Fruta("Mora", 550);
    Fruta Naranja= new Fruta("Naranja", 600);
    Fruta Uva=new Fruta("Uva", 650);
    Fruta Platano= new Fruta("Plátano",630);
        
        listaFruta.add(Durazno);
        listaFruta.add(Frambuesa);
        listaFruta.add(Frutilla);
        listaFruta.add(Lichi);
        listaFruta.add(Mango);
        listaFruta.add(Manzana);
        listaFruta.add(Mora);
        listaFruta.add(Naranja);
        listaFruta.add(Uva);
        listaFruta.add(Platano);
        return listaFruta;
        
    }
   
    
         
  
      
}

