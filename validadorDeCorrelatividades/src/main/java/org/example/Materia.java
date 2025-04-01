package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public boolean cumpleCorrelativas(List<Materia> materiasAprobadas) {
        return materiasAprobadas.containsAll(this.correlativas);
    }

    public List<Materia> getMateriasAprobadas(Alumno alumno) {
        return alumno.getMateriasAprobadas();
    }


}
