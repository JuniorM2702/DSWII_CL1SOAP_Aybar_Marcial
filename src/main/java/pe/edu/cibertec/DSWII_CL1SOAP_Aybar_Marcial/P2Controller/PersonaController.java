package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.P2Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @GetMapping("/verificar-dni")
    public boolean verificarDni(@RequestParam int anioNacimiento) {
        int edad = Year.now().getValue() - anioNacimiento;
        return edad >= 18;
    }
}