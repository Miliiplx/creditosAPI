package ar.com.ada.api.creditos.repos;

import org.springframework.data.jpa.repository.JpaRepository; //se elige el que sea de springboot

import ar.com.ada.api.creditos.entities.*; 

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}