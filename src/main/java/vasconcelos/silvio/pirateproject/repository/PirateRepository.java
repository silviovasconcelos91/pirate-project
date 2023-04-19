package vasconcelos.silvio.pirateproject.repository;

import org.springframework.data.repository.CrudRepository;
import vasconcelos.silvio.pirateproject.data.Pirate;

public interface PirateRepository extends CrudRepository<Pirate, String> {
}
