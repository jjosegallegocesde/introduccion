/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intersoftware.introduccion.servicios;

import com.intersoftware.introduccion.modelos.Pelicula;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan
 */

@Service
public class ServicioPeliculas {
    
    //Atibutos
    Pelicula pelicula = new Pelicula();
    
    
    public List<Pelicula> buscarPeliculas(){
        
        List<Pelicula> peliculas=new ArrayList<>();
              
        
        //consultasmodelo
        pelicula=new Pelicula();
        pelicula.setTitulo("Crusero misterioso");
        pelicula.setSinopsis("la roca buscara el tesoro escondido");
        pelicula.setDuracion(125);
        pelicula.setUrlFoto("https://github.com/jjosegallegocesde/poster/blob/main/p1.jpg?raw=true");
        peliculas.add(pelicula);
        
        pelicula=new Pelicula();
        pelicula.setTitulo("Venom");
        pelicula.setSinopsis("Eddy brook le ganara a spiderman");
        pelicula.setDuracion(135);
        pelicula.setUrlFoto("https://github.com/jjosegallegocesde/poster/blob/main/p2.jpg?raw=true");
        peliculas.add(pelicula);
        
        return peliculas;
        
    }
    
}
