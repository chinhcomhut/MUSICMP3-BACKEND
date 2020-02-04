package com.codegym.wbdlaptop.repository;

import com.codegym.wbdlaptop.model.Song;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findAllByUserId (Long userId);
    Optional<Song> findByNameSongContaining(String song);
    List<Song> findAllByOrderByLikeSongDesc();
    List<Song> findAllByOrderByListenSongDesc();
    Optional<Song> findByMp3Url(String mp3Url);
}