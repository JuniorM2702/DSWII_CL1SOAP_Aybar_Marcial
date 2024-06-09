package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/numeros")
public class NumeroController {

    @GetMapping("/pares-descendentes")
    public List<Integer> obtenerParesDescendentes() {
        List<Integer> numerosPares = new ArrayList<>();
        for (int i = 20; i >= 10; i--) {
            if (i % 2 == 0) {
                numerosPares.add(i);
            }
        }
        return numerosPares;
    }
}