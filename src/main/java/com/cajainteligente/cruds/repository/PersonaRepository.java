package com.cajainteligente.cruds.repository;

import com.cajainteligente.cruds.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS
 */
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
