package SpringStuff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashMap;
import java.util.List;

@Entity
@Table(name = "artist_genius_list")
public class Artist {
    @Id
    @Column(name = "id")
    public int id;

    @Column(name = "stage_name")
    public String name;

    public HashMap<String, List<String>> albums;

    public Artist(String name, HashMap<String, List<String>> albums) {
        this.name = name;
        this.albums = albums;
    }

    public Artist(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, List<String>> getAlbums() {
        return albums;
    }

    public void setAlbums(HashMap<String, List<String>> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", albums=" + albums +
                '}';
    }
}