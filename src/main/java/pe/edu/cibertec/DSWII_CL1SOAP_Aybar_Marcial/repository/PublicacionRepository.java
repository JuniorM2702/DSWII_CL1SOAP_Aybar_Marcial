package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.model.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Integer> {
}
