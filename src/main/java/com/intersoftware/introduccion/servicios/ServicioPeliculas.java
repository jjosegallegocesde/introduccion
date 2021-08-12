/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intersoftware.introduccion.servicios;

import com.intersoftware.introduccion.Pelicula.RepositorioPelicula;
import com.intersoftware.introduccion.modelos.Pelicula;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan
 */

@Service
public class ServicioPeliculas {
    
    private final RepositorioPelicula consulta;

    public ServicioPeliculas(RepositorioPelicula consulta) {
        this.consulta = consulta;
    }
    
    
    public List<Pelicula> buscarPeliculas(){
        
      return consulta.findAll();
        
    }
    
}
