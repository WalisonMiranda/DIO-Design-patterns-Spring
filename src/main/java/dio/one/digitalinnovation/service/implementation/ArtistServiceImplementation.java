package dio.one.digitalinnovation.service.implementation;

import dio.one.digitalinnovation.model.Art;
import dio.one.digitalinnovation.model.Artist;
import dio.one.digitalinnovation.repository.ArtRepository;
import dio.one.digitalinnovation.repository.ArtistRepository;
import dio.one.digitalinnovation.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtistServiceImplementation implements ArtistService {

    @Autowired
    private ArtistRepository artistRepository;
    @Autowired
    private ArtRepository artRepository;

    @Override
    public void createArtist(Artist artist) {
        artistRepository.save(artist);
    }

    @Override
    public Iterable<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Optional<Artist> getArtistById(Long id) {
        return artistRepository.findById(id);
    }

    @Override
    public void updateArtist(Long id, Artist artist) {
        Optional<Artist> artistFound = artistRepository.findById(id);

        if (artistFound.isPresent()) { artistRepository.save(artist); }
    }

    @Override
    public void deleteArtist(Long id) {
        artistRepository.deleteById(id);
    }
}
