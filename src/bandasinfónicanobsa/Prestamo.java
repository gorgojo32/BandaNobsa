/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandasinfónicanobsa;

import java.time.LocalDate;


public class Prestamo {
    private Instrumento instrumento;
    private String nombreMiembro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionProgramada;
    private LocalDate fechaDevolucionReal;



 

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public Prestamo(Instrumento instrumento, String nombreMiembro, LocalDate fechaPrestamo, LocalDate fechaDevolucionProgramada) {
        this.instrumento = instrumento;
        this.nombreMiembro = nombreMiembro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionProgramada = fechaDevolucionProgramada;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public String getNombreMiembro() {
        return nombreMiembro;
    }

    public void setNombreMiembro(String nombreMiembro) {
        this.nombreMiembro = nombreMiembro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucionProgramada() {
        return fechaDevolucionProgramada;
    }

    public void setFechaDevolucionProgramada(LocalDate fechaDevolucionProgramada) {
        this.fechaDevolucionProgramada = fechaDevolucionProgramada;
    }

    public LocalDate getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(LocalDate fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }
    
    
    
}
