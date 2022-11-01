package dio.one.digitalinnovation.service;

import dio.one.digitalinnovation.model.Art;
import dio.one.digitalinnovation.model.Artist;

import java.util.Optional;

public interface ArtistService {

    void createArtist(Artist artist);
    Iterable<Artist> getAllArtists();
    Optional<Artist> getArtistById(Long id);
    void updateArtist(Long id, Artist artist);
    void deleteArtist(Long id);
}
