package es.cie.springbootback.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import es.cie.springbootback.negocio.Ordenador;
@Repository
@Qualifier("jdbc")

public class OrdenadorRepositoryJDBC implements OrdenadorRepository {

    @Autowired
    private JdbcTemplate plantilla;

    @Override
    public List<Ordenador> buscarTodos() {
        return plantilla.query("select * from ordenador", new OrdenadorRowMapper());
    }

    @Override
    public void insertar(Ordenador ordenador) {
        plantilla.update("insert into ordenador values(?,?,?,?)",
                ordenador.getModelo(), ordenador.getMarca(), ordenador.getPrecio(), ordenador.getNumserie());
    }   


    @Override
    public void borrar(Ordenador ordenador) {
        plantilla.update("delete from ordenador where numserie=?", ordenador.getNumserie());
    }

    @Override
    public List<Ordenador> buscarTodosPorModelo(String modelo) {
        return plantilla.query("select * from ordenador where modelo like?", new OrdenadorRowMapper(), "%" + modelo + "%");
    }

    @Override
    public List<Ordenador> buscarTodosPorMarca(String marca) {
        return plantilla.query("select * from ordenador where marca like?", new OrdenadorRowMapper(), "%" + marca + "%");
    }
}
