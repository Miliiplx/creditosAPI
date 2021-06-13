package ar.com.ada.api.creditos.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.creditos.entities.Prestamo;

//Integer es el tipo objeto de int 


public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

    
}