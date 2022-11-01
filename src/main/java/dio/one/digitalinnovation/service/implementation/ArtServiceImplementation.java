package dio.one.digitalinnovation.service.implementation;

import dio.one.digitalinnovation.model.Art;
import dio.one.digitalinnovation.model.Artist;
import dio.one.digitalinnovation.repository.ArtRepository;
import dio.one.digitalinnovation.repository.ArtistRepository;
import dio.one.digitalinnovation.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtServiceImplementation implements ArtService {

    @Autowired
    private ArtRepository artRepository;
    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public void createArt(Art art) {
        artRepository.save(art);
    }

    @Override
    public Iterable<Art> getAllArts() {
        return artRepository.findAll();
    }

    @Override
    public Optional<Art> getArtById(Long id) {
        return artRepository.findById(id);
    }

    @Override
    public void updateArt(Long id, Art art) {
        Optional<Art> artFound = artRepository.findById(id);

        if (artFound.isPresent()) { artRepository.save(art); }
    }

    @Override
    public void deleteArt(Long id) {
        artRepository.deleteById(id);
    }
}
