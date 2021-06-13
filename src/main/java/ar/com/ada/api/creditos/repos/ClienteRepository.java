package ar.com.ada.api.creditos.repos;

import org.springframework.data.jpa.repository.JpaRepository; //se elige el que sea de springboot
import org.springframework.stereotype.Repository;

import ar.com.ada.api.creditos.entities.*; 

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}