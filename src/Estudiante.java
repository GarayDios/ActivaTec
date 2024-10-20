/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Danie
 */
public class Estudiante {
    private String Carrera;
    private String nocontrol;
    private String semestre;

    public Estudiante() {
    }

    public Estudiante(String Carrera, String nocontrol, String semestre) {
        this.Carrera = Carrera;
        this.nocontrol = nocontrol;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
        
}
