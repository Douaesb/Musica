package com.music.musica.service.impl;

import com.music.musica.dto.ChansonDTO;
import com.music.musica.mapper.ChansonMapper;
import com.music.musica.model.Chanson;
import com.music.musica.repository.ChansonRepository;
import com.music.musica.service.ChansonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ChansonServiceImpl implements ChansonService {

    @Autowired
    private ChansonRepository chansonRepository;

    @Autowired
    private ChansonMapper chansonMapper;

    @Override
    public Page<ChansonDTO> getAllChansons(Pageable pageable) {
        return chansonRepository.findAll(pageable).map(chansonMapper::toDTO);
    }

    @Override
    public Page<ChansonDTO> searchChansonsByTitle(String title, Pageable pageable) {
        return chansonRepository.findByTitleContaining(title, pageable).map(chansonMapper::toDTO);
    }

    @Override
    public Page<ChansonDTO> getChansonsByAlbumId(String albumId, Pageable pageable) {
        return chansonRepository.findByAlbumId(albumId, pageable).map(chansonMapper::toDTO);
    }

    @Override
    public ChansonDTO createChanson(ChansonDTO chansonDTO) {
        Chanson chanson = chansonMapper.toEntity(chansonDTO);
        return chansonMapper.toDTO(chansonRepository.save(chanson));
    }

    @Override
    public ChansonDTO updateChanson(String id, ChansonDTO chansonDTO) {
        Chanson chanson = chansonMapper.toEntity(chansonDTO);
        chanson.setId(id);
        return chansonMapper.toDTO(chansonRepository.save(chanson));
    }

    @Override
    public void deleteChanson(String id) {
        chansonRepository.deleteById(id);
    }
}