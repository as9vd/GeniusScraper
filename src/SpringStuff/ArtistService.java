package SpringStuff;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArtistService {
    ArtistDataAccessObject artistDataAccessObject;

    public ArtistService(ArtistDataAccessObject artistDataAccessObject) {
        this.artistDataAccessObject = artistDataAccessObject;
    }

    public ArtistDataAccessObject getArtistRepository() {
        return artistDataAccessObject;
    }

    public void setArtistRepository(ArtistDataAccessObject artistDataAccessObject) {
        this.artistDataAccessObject = artistDataAccessObject;
    }

    @Transactional
    public void pushArtist(Artist artist) {
        artistDataAccessObject.save(artist);
    }

}