package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.P2Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estacionamiento")
public class EstacionamientoController {

    @GetMapping("/calcular")
    public double calcularPago(@RequestParam int horas, @RequestParam int minutos) {
        double tarifaPorHora = 1.5;
        double totalHoras = horas + (minutos > 0 ? 1 : 0);
        return totalHoras * tarifaPorHora;
    }
}