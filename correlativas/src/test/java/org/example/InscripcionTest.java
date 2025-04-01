package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


class InscripcionTest {

    @Test
    @DisplayName("Test ...")
    public void inscripcionAprobada() {

        Materia materia1 = new Materia();
        Materia materia2 = new Materia();
        materia2.setCorrelativas(List.of(materia1));

        Materia materia = new Materia();
        materia.setCorrelativas(List.of(materia2));

        Alumno alumno = new Alumno();
        alumno.setMateriasAprobadas(List.of(materia1, materia2));

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMateriasACursar(Set.of(materia));

        assertTrue(inscripcion.aprobada());
    }
}