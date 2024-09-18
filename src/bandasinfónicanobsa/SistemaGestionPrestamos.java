
package bandasinfónicanobsa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class SistemaGestionPrestamos {
     private List<Instrumento> inventario;
    private List<Prestamo> prestamos;

    public SistemaGestionPrestamos() {
        this.inventario = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento instrumento) {
        inventario.add(instrumento);
    }

    public void eliminarInstrumento(Instrumento instrumento) {
        inventario.remove(instrumento);
    }

    public void actualizarEstadoInstrumento(Instrumento instrumento, EstadoInstrumento nuevoEstado) {
        instrumento.setEstado(nuevoEstado);
    }

    public Prestamo solicitarPrestamo(String nombreMiembro, Instrumento instrumento, LocalDate fechaDevolucion) {
        if (instrumento.getCantidadDisponible() > 0) {
            Prestamo prestamo = new Prestamo(instrumento, nombreMiembro, LocalDate.now(), fechaDevolucion);
            prestamos.add(prestamo);
            instrumento.setCantidadDisponible(instrumento.getCantidadDisponible() - 1);
            return prestamo;
        }
        return null; // No hay instrumentos disponibles
    }

    public void registrarDevolucion(Prestamo prestamo) {
        prestamo.setFechaDevolucionReal(LocalDate.now());
        prestamo.getInstrumento().setCantidadDisponible(prestamo.getInstrumento().getCantidadDisponible() + 1);
    }

    public List<Instrumento> listarInstrumentosDisponibles() {
        return inventario.stream()
                .filter(i -> i.getCantidadDisponible() > 0)
                .collect(Collectors.toList());
    }

    public List<Prestamo> listarPrestamosActivos() {
        return prestamos.stream()
                .filter(p -> p.getFechaDevolucionReal() == null)
                .collect(Collectors.toList());
    }

    public List<Prestamo> listarPrestamosVencidos() {
        LocalDate hoy = LocalDate.now();
        return prestamos.stream()
                .filter(p -> p.getFechaDevolucionReal() == null && p.getFechaDevolucionProgramada().isBefore(hoy))
                .collect(Collectors.toList());
    }

    public Map<GrupoInstrumento, Long> generarReporteUsoPorGrupo() {
        return prestamos.stream()
                .collect(Collectors.groupingBy(p -> p.getInstrumento().getGrupo(), Collectors.counting()));
    }
}
