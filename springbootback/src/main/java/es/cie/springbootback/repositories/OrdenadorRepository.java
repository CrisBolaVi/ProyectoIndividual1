package es.cie.springbootback.repositories;

import java.util.List;
import es.cie.springbootback.negocio.Ordenador;

public interface OrdenadorRepository {
     List<Ordenador> buscarTodos();
     List<Ordenador> buscarTodosPorModelo(String modelo);
     List<Ordenador> buscarTodosPorMarca(String marca);
     
   
    void insertar (Ordenador ordenador);
    void borrar(Ordenador ordenador);


}
