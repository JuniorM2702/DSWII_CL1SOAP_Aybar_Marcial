package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.P2Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/almacen")
public class AlmacenController {

    @GetMapping("/calcular-descuento")
    public double calcularDescuento(@RequestParam double cantidad, @RequestParam double precioUnitario) {
        double total = cantidad * precioUnitario;
        if (total > 200) {
            total *= 0.8;
        }
        return total;
    }
}