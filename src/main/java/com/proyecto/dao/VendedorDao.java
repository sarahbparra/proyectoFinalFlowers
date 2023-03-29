package com.proyecto.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entities.Vendedor;



@Repository

public interface VendedorDao extends JpaRepository <Vendedor, Integer> { //Interfaz de la clase Facultad
    
}
