package pe.edu.vallegrande.kevinpersonarest.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.vallegrande.kevinpersonarest.model.Persona;

@Repository
public interface PersonaRepository extends ReactiveCrudRepository<Persona, Long> {
}