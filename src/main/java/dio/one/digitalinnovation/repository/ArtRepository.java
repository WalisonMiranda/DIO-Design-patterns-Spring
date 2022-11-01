package dio.one.digitalinnovation.repository;

import dio.one.digitalinnovation.model.Art;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtRepository extends CrudRepository<Art, Long> {
}
