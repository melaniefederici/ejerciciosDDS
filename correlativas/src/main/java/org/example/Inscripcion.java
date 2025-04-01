package org.example;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inscripcion {
    private Set<Materia> materiasACursar;
    private boolean aceptada;
    @Setter
    private Alumno alumno;
    private LocalDateTime fecha;

    public boolean aprobada() {
        return materiasACursar.stream()
                .allMatch(materia -> materia.cumpleCorrelativas(alumno.getMateriasAprobadas()));
    }
}
