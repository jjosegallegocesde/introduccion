/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intersoftware.introduccion.Pelicula;

import com.intersoftware.introduccion.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Juan
 */
public interface RepositorioPelicula extends JpaRepository<Pelicula,Integer> {
    
}
