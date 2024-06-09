package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.service;

import pe.edu.cibertec.ws.objects.Publicacionws;
import java.util.List;

public interface IPublicacionService {
    List<Publicacionws> listarPublicaciones();
    Publicacionws obtenerPublicacionxId(int id);
    Publicacionws registrarActualizarPublicacion(Publicacionws publicacionws);
}
