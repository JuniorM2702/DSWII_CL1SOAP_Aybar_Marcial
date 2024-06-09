package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.model.Autor;
import pe.edu.cibertec.ws.objects.Autoresws;
import java.util.ArrayList;
import java.util.List;

@Component
public class AutorConvert {

    public Autor convertAutorWsToAutor(Autoresws autoresws){

        Autor autor = new Autor();
        autor.setIdautor(autoresws.getIdautor());
        autor.setNomautor(autoresws.getNomautor());
        autor.setApeautor(autoresws.getApeautor());
        autor.setFechnacautor(autoresws.getFechnacautor());
        return autor;
    }

    public List<Autor> convertAutorWsToAutor(List<Autoresws> autoresws){
        List<Autor> autorList = new ArrayList<>();
        autoresws.forEach(dom -> {
            autorList.add(convertAutorWsToAutor(dom));
        });
        return autorList;
    }

    public Autoresws convertAutorToAutorWs(Autor autor){
        Autoresws autoresws = new Autoresws();
        autoresws.setIdautor(autor.getIdautor());
        autoresws.setNomautor(autor.getNomautor());
        autoresws.setApeautor(autor.getApeautor());
        autoresws.setFechnacautor(autor.getFechnacautor());
        return autoresws;
    }

    public List<Autoresws> convertAutorToAutorWs(List<Autor> autor){
        List<Autoresws> autorList = new ArrayList<>();
        autor.forEach(dom ->{
            autorList.add(convertAutorToAutorWs(dom));
        });
        return autorList;
    }

}
