package vasconcelos.silvio.pirateproject.repository;

import org.springframework.data.repository.ListCrudRepository;
import vasconcelos.silvio.pirateproject.data.Pirate;

public interface PirateRepository extends ListCrudRepository<Pirate, String> {
}
