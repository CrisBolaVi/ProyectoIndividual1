package es.cie.springbootback.repositories;

import java.util.List;

import es.cie.springbootback.negocio.Ordenador;

public interface OrdenadorRepository  {
    
        List<Ordenador> buscarTodos();  
    
    void insertar (Ordenador ordenador);
    void borrar(Ordenador ordenador);


}

