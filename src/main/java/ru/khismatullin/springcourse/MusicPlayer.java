package ru.khismatullin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.jazzMusic = jazzMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + jazzMusic.getSong());
    }
}
