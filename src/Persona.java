/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52311
 */
public class Persona {
    private String nombre;
    private byte edad;
    private int AMaterno;
    private int APaterno;
    private String fechsNacimiento;
    private String ocupacion;

    public Persona() {
    }

    public Persona(String nombre, byte edad, int AMaterno, int APaterno, String fechsNacimiento, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.AMaterno = AMaterno;
        this.APaterno = APaterno;
        this.fechsNacimiento = fechsNacimiento;
        this.ocupacion = ocupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(int AMaterno) {
        this.AMaterno = AMaterno;
    }

    public int getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(int APaterno) {
        this.APaterno = APaterno;
    }

    public String getFechsNacimiento() {
        return fechsNacimiento;
    }

    public void setFechsNacimiento(String fechsNacimiento) {
        this.fechsNacimiento = fechsNacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", AMaterno=").append(AMaterno);
        sb.append(", APaterno=").append(APaterno);
        sb.append(", fechsNacimiento=").append(fechsNacimiento);
        sb.append(", ocupacion=").append(ocupacion);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
