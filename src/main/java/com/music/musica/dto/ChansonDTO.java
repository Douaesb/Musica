package com.music.musica.dto;


import lombok.Data;

@Data
public class ChansonDTO {
    private String id;
    private String title;
    private Integer duree;
    private Integer trackNumber;
    private String albumId;
}
