package es.cie.springbootback.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import es.cie.springbootback.negocio.Ordenador;

public interface OrdenadorRepository  {
    
        List<Ordenador> buscarTodos();  
    
    void insertar (Ordenador ordenador);
    void borrar(Ordenador ordenador);
     Page<Ordenador> buscarPaginado(Pageable pageable);


}

