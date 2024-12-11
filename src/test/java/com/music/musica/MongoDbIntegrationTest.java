package com.music.musica;

import com.music.musica.model.Album;
import com.music.musica.repository.AlbumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MongoDbIntegrationTest {

    @Autowired
    private AlbumRepository albumRepository;

    @Test
    void testMongoDbConnection() {
        Album album = new Album();
        album.setTitre("Test Album");
        album.setArtiste("Test Artist");
        album.setAnnee(2024);

        albumRepository.save(album);
        assert albumRepository.findAll().size() > 0;
    }
}
