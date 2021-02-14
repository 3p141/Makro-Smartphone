package kickstart.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

@Repository
public interface MakroRepository extends CrudRepository<MakroEntry, Integer>{
    @Override
    Streamable<MakroEntry> findAll();
}
