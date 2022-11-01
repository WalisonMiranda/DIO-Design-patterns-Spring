package dio.one.digitalinnovation.controller;

import dio.one.digitalinnovation.model.Art;
import dio.one.digitalinnovation.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("arts")
public class ArtController {

    @Autowired
    private ArtService artService;

    @PostMapping
    public ResponseEntity<Art> create(@RequestBody Art art) {
        artService.createArt(art);

        return ResponseEntity.ok(art);
    }

    @GetMapping
    public ResponseEntity<Iterable<Art>> findAll() {
        return ResponseEntity.ok(artService.getAllArts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Art>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(artService.getArtById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Art> update(@PathVariable Long id, @RequestBody Art art) {
        artService.updateArt(id, art);

        return ResponseEntity.ok(art);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        artService.deleteArt(id);

        return ResponseEntity.ok("Art successfully deleted");
    }
}
