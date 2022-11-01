package dio.one.digitalinnovation.service;

import dio.one.digitalinnovation.model.Art;
import dio.one.digitalinnovation.model.Artist;

import java.util.Optional;

public interface ArtService {

    void createArt(Art art);
    Iterable<Art> getAllArts();
    Optional<Art> getArtById(Long id);
    void updateArt(Long id, Art art);
    void deleteArt(Long id);
}
