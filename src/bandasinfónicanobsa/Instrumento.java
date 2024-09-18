/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandasinfónicanobsa;


public class Instrumento {
    private String nombre;
    private GrupoInstrumento grupo;
    private EstadoInstrumento estado;
    private int cantidadDisponible;

    public Instrumento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GrupoInstrumento getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoInstrumento grupo) {
        this.grupo = grupo;
    }

    public EstadoInstrumento getEstado() {
        return estado;
    }

    public void setEstado(EstadoInstrumento estado) {
        this.estado = estado;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    
    
    
    
}
