package pt.iade.projetomobile.lazuli.models.agenda;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends CrudRepository<Agenda, Integer>{

    Agenda findById(int id);

}
