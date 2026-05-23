package pe.edu.vallegrande.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.model.Persona;

@Repository
public interface PersonaRepository extends ReactiveCrudRepository<Persona, Long> {
}