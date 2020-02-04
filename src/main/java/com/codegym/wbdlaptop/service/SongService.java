package com.codegym.wbdlaptop.service;

import com.codegym.wbdlaptop.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongService {

    Optional<Song> findByMp3Url(String mp3Url);

    List<Song> findAllByOrderByLikeSong();

    List<Song> findAllByOrderByListenSong();

    List<Song> findAllByUserId (Long userId);

    List<Song> findAll();

    Optional<Song> findById(long id);

    Song findByIdSong(Long id);

    Song save(Song song);

    void delete(long id);

    Optional<Song> findByNameSongContaining(String song);
}
