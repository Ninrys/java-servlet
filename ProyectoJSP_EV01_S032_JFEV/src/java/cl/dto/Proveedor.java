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
public class Proveedor {
   // private static ArrayList<Proveedor> listaProv = new ArrayList<>();
    private String provRut;
    private String provName;
    private String provNumber;

    public Proveedor(String provRut, String provName, String provNumber) {
        this.provRut = provRut;
        this.provName = provName;
        this.provNumber = provNumber;
    }

    public Proveedor() {
    }

    public String getProvRut() {
        return provRut;
    }

    public void setProvRut(String provRut) {
        this.provRut = provRut;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getProvNumber() {
        return provNumber;
    }

    public void setProvNumber(String provNumber) {
        this.provNumber = provNumber;
    }

 /* public static ArrayList<Proveedor> getLista() {
        return listaProv;
    }*/
  /* public static String crearProv(String rut, String nom, String num) {

        try {
            Proveedor p = new Proveedor();

            p.setProvRut(rut);
            p.setProvName(nom);
            p.setProvNumber(num);
            listaProv.add(p);
            return "Proveedor Agregado Correctamente";

        } catch (Exception e) {

            return "Error: " + e.toString();
        }

    }
public static Proveedor buscarProv(String id) {

        for (Proveedor p : listaProv) {
            if (p.provRut.equals(id)) {
                return p;
            }
        }
        return null;
    }
 public static String eliminarProv(String rut) {

        Proveedor m = buscarProv(rut);
        listaProv.remove(m);
        return "Proveedor Eliminado";

    }
    
    */
    
    
    
}
 

