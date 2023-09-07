package ru.khismatullin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ru.khismatullin.springcourse.MusicGenre.CLASSICAL;
import static ru.khismatullin.springcourse.MusicGenre.JAZZ;

public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private JazzMusic jazzMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.jazzMusic = jazzMusic;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "classicalMusic=" + classicalMusic +
                ", jazzMusic=" + jazzMusic +
                '}';
    }

    public String playMusic(MusicGenre musicGenre) {
        List<String> songList;
        if (musicGenre == JAZZ) {
            songList = jazzMusic.getSongList();
        } else {
            songList = classicalMusic.getSongList();
        }
        Random random = new Random();
        int i = random.nextInt(3);
        return "Playing song #" + (i + 1) + " : " + songList.get(i);
    }
}
