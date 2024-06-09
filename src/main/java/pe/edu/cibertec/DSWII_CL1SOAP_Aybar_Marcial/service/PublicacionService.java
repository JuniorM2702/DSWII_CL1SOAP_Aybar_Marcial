package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.convert.PublicacionConvert;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.model.Publicacion;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.repository.PublicacionRepository;
import pe.edu.cibertec.ws.objects.Publicacionws;
import java.util.List;

@Service
public class PublicacionService implements IPublicacionService {

    private PublicacionRepository publicacionRepository;
    private PublicacionConvert publicacionConvert;

    @Autowired
    public PublicacionService(PublicacionRepository publicacionRepository, PublicacionConvert publicacionConvert) {
        this.publicacionRepository = publicacionRepository;
        this.publicacionConvert = publicacionConvert;
    }

    public List<Publicacionws> listarPublicaciones() {
        List<Publicacion> publicaciones = publicacionRepository.findAll();
        return publicacionConvert.convertPublicacionToPublicacionWs(publicaciones);
    }

    public Publicacionws obtenerPublicacionxId(int id) {
        Publicacion publicacion = publicacionRepository.findById(id).orElse(null);
        if (publicacion != null) {
            return publicacionConvert.convertPublicacionToPublicacionWs(publicacion);
        }
        return null;
    }

    public Publicacionws registrarActualizarPublicacion(Publicacionws publicacionws) {
        Publicacion publicacion = publicacionConvert.convertPublicacionWsToPublicacion(publicacionws);
        Publicacion publicacionGuardada = publicacionRepository.save(publicacion);
        return publicacionConvert.convertPublicacionToPublicacionWs(publicacionGuardada);
    }
}
