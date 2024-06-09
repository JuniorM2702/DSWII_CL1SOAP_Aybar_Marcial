package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @PostMapping("/calcular-promedio")
    public double calcularPromedio(@RequestBody double[] notas) {
        if (notas.length != 4) {
            throw new IllegalArgumentException("Debe ingresar exactamente 4 notas");
        }

        double menorNota = notas[0];
        int indiceMenorNota = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menorNota) {
                menorNota = notas[i];
                indiceMenorNota = i;
            }
        }

        double[] notasFiltradas = new double[3];
        int index = 0;
        for (int i = 0; i < notas.length; i++) {
            if (i != indiceMenorNota) {
                notasFiltradas[index++] = notas[i];
            }
        }

        return notasFiltradas[0] * 0.2 + notasFiltradas[1] * 0.3 + notasFiltradas[2] * 0.5;
    }
}