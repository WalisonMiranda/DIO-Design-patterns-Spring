package dio.one.digitalinnovation.controller;

import dio.one.digitalinnovation.model.Artist;
import dio.one.digitalinnovation.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("artists")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @PostMapping
    public ResponseEntity<Artist> create(@RequestBody Artist artist) {
        artistService.createArtist(artist);

        return ResponseEntity.ok(artist);
    }

    @GetMapping
    public ResponseEntity<Iterable<Artist>> findAll() {
        return ResponseEntity.ok(artistService.getAllArtists());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Artist>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(artistService.getArtistById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Artist> update(@PathVariable Long id, @RequestBody Artist artist) {
        artistService.updateArtist(id, artist);

        return ResponseEntity.ok(artist);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        artistService.deleteArtist(id);

        return ResponseEntity.ok("Artist successfully deleted");
    }
}
