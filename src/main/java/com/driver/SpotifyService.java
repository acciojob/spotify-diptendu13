package com.driver;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class SpotifyService {

    //Auto-wire will not work in this case, no need to change this and add autowire

    SpotifyRepository spotifyRepository = new SpotifyRepository();

    public User createUser(String name, String mobile){
        return spotifyRepository.createUser(name, mobile);
    }

    public Artist createArtist(String name) {
        return spotifyRepository.createArtist(name);
    }

    public Album createAlbum(String title, String artistName) {
        return spotifyRepository.createAlbum(title, artistName);
    }

    public Song createSong(String title, String albumName, int length) throws Exception {
        try{
            return spotifyRepository.createSong(title, albumName, length);
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public Playlist createPlaylistOnLength(String mobile, String title, int length) throws Exception {
        try{
            return spotifyRepository.createPlaylistOnLength(mobile, title, length);
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public Playlist createPlaylistOnName(String mobile, String title, List<String> songTitles) throws Exception {
        try{
            return spotifyRepository.createPlaylistOnName(mobile, title, songTitles);
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public Playlist findPlaylist(String mobile, String playlistTitle) throws Exception {
        try{
            return spotifyRepository.findPlaylist(mobile, playlistTitle);
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public Song likeSong(String mobile, String songTitle) throws Exception {
        try{
            return spotifyRepository.likeSong(mobile, songTitle);
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public String mostPopularArtist() {
        return spotifyRepository.mostPopularArtist();
    }

    public String mostPopularSong() {
        return spotifyRepository.mostPopularSong();
    }
}
