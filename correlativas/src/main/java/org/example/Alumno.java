package org.example;

import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas;

    public void agregarMateriaAprobada(Materia materia){
        this.materiasAprobadas.add(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

}
