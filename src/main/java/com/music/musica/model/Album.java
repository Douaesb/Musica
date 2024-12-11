package com.music.musica.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "albums")
public class Album {
    @Id
    private String id;
    private String titre;
    private String artiste;
    private int annee;
}