package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.exception.NotFoundException;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.service.AutorService;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class AutorEndPoint {
    private AutorService autorService;
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getAutoresRequest")
    @ResponsePayload
    public GetAutoresResponse getAutores(@RequestPayload GetAutoresRequest request){
        GetAutoresResponse response = new GetAutoresResponse();
        response.getAutores().addAll(autorService.listarAutores());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getAutorRequest")
    @ResponsePayload
    public GetAutorResponse getAutor(@RequestPayload GetAutorRequest request){
        GetAutorResponse response = new GetAutorResponse();
        Autoresws autoresws = autorService.obtenerAutorxId(request.getId());
        if(autoresws == null)
            throw new NotFoundException("El autor con el ID " + request.getId()+" no existe");
        response.setAutor(autoresws);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postAutorRequest")
    @ResponsePayload
    public PostAutorResponse saveAutor(@RequestPayload PostAutorRequest request){
        PostAutorResponse response = new PostAutorResponse();
        response.setAutor(autorService.registrarActualizarAutor(request.getAutor()));
        return response;
    }

}
