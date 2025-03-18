package es.cie.springbootback.repositories;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
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
    public Page<Ordenador> buscarPaginado(Pageable pageable) {
        int offset = pageable.getPageNumber() * pageable.getPageSize();
        int limit = pageable.getPageSize();
      
        String sql = "select * from ordenador limit ? offset ?";
        List<Ordenador> ordenadores = plantilla.query(sql, new OrdenadorRowMapper(), limit, offset);

        String countSql = "SELECT COUNT(*) FROM ordenadores";
        int total = plantilla.queryForObject(countSql, Integer.class);

        return new PageImpl<>(ordenadores, pageable, total);
    }
    }

   

   
  

