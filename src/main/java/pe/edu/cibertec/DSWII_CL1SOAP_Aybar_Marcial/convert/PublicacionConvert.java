package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.model.Publicacion;
import pe.edu.cibertec.ws.objects.Publicacionws;
import java.util.ArrayList;
import java.util.List;

@Component
public class PublicacionConvert {

    public Publicacion convertPublicacionWsToPublicacion(Publicacionws publicacionws){

        Publicacion publicacion = new Publicacion();
        publicacion.setIdPublicacion(publicacionws.getIdPublicacion());
        publicacion.setTitulo(publicacionws.getTitulo());
        publicacion.setResumen(publicacionws.getResumen());
        publicacion.setFechPublicacion(publicacionws.getFechPublicacion());
        publicacion.setIdAutor(publicacionws.getIdAutor());
        return publicacion;
    }

    public List<Publicacion> convertPublicacionWsToPublicacion(List<Publicacionws> publicacionws){
        List<Publicacion> publicacionList = new ArrayList<>();
        publicacionws.forEach(dom -> {
            publicacionList.add(convertPublicacionWsToPublicacion(dom));
        });
        return publicacionList;
    }

    public Publicacionws convertPublicacionToPublicacionWs(Publicacion publicacion){
        Publicacionws publicacionws = new Publicacionws();
        publicacionws.setIdPublicacion(publicacion.getIdPublicacion());
        publicacionws.setTitulo(publicacion.getTitulo());
        publicacionws.setResumen(publicacion.getResumen());
        publicacionws.setFechPublicacion(publicacion.getFechPublicacion());
        publicacionws.setIdAutor(publicacion.getIdAutor());
        return publicacionws;
    }

    public List<Publicacionws> convertPublicacionToPublicacionWs(List<Publicacion> publicacion){
        List<Publicacionws> publicacionList = new ArrayList<>();
        publicacion.forEach(dom ->{
            publicacionList.add(convertPublicacionToPublicacionWs(dom));
        });
        return publicacionList;
    }

}
