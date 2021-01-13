/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dto;



/**
 *
 * @author Ninry
 */
public class Cliente {
    private String rut;
    private String nombre;
    private String email;
    private String Pais;
    private String comentario;
    
   // private static ArrayList<Cliente> listaCliente = new ArrayList<>();
    public Cliente(String rut, String nombre, String email, String Pais, String comentario) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
        this.Pais = Pais;
        this.comentario= comentario;
    }

    public Cliente() {
    }
    

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    /* public static ArrayList<Cliente> getLista() {
        return listaCliente;
    }
     *
  /*   public static Cliente crearCliente(String rut, String nom, String email, String pais, String comen) {

        try {
            Cliente c = new Cliente();

            c.setRut(rut);
            c.setNombre(nom);
            c.setEmail(email);e
            c.setPais(pais);
            c.setComentario(comen);
            listaCliente.add(c);
            return "Cliente agregado";

        } catch (Exception e) {

            return "Error: " + e.toString();
        }

    }
        
    */
}
