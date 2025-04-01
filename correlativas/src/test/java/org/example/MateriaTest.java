package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @Test
    public void saberSiCumpleCorrelativas() {
        Materia materia = new Materia();

        Materia correlativa1 = new Materia();
        Materia correlativa2 = new Materia();

        materia.setCorrelativas(List.of(correlativa1, correlativa2));

        List<Materia> materiasAprobadas = List.of(correlativa1, correlativa2);

        assertTrue(materia.cumpleCorrelativas(materiasAprobadas));
    }
}