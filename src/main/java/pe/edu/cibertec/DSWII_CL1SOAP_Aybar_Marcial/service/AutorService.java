package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.convert.AutorConvert;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.model.Autor;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.repository.AutorRepository;
import pe.edu.cibertec.ws.objects.Autoresws;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AutorService implements IAutorService {
    private AutorRepository autorRepository;
    private AutorConvert autorConvert;

    @Override
    public List<Autoresws> listarAutores() {
        return autorConvert.convertAutorToAutorWs(autorRepository.findAll());
    }

    @Override
    public Autoresws obtenerAutorxId(int id) {
        Optional<Autor> autor = autorRepository.findById(id);
        return autor.map(value -> autorConvert.convertAutorToAutorWs(value)).orElse(null);
    }

    @Override
    public Autoresws registrarActualizarAutor(Autoresws autoresws) {
        Autor nuevoAutor = autorRepository.save(
                autorConvert.convertAutorWsToAutor(autoresws));
        if(nuevoAutor == null)
            return null;
        return autorConvert.convertAutorToAutorWs(nuevoAutor);
    }
}
