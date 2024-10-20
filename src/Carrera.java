/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52311
 */
public class Carrera {
    private String clave;
    private String nombre;

    public Carrera() {
    }

    public Carrera(String clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrera{");
        sb.append("clave=").append(clave);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
