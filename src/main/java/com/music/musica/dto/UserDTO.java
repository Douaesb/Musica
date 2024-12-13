package com.music.musica.dto;


import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private String id;
    private String username;
    private String password;
    private Boolean active = true;
    private List<String> roles;
}
