package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.service;

import pe.edu.cibertec.ws.objects.Autoresws;

import java.util.List;

public interface IAutorService {
    List<Autoresws> listarAutores();
    Autoresws obtenerAutorxId(int id);
    Autoresws registrarActualizarAutor(Autoresws autor);

}
