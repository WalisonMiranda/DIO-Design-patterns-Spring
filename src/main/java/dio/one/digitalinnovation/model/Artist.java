package dio.one.digitalinnovation.model;
import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String bio;
    private String category;
    @OneToMany
    @IndexColumn(name = "arts")
    private Art[] arts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Art[] getArts() {
        return arts;
    }

    public void setArts(Art[] arts) {
        this.arts = arts;
    }
}
