package ru.khismatullin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {
    private List<String> songList = new ArrayList<>();

    @Autowired
    private JazzMusic() {
        songList.add("Take Five");
        songList.add("My Way");
        songList.add("In The Mood");
    }

    @Override
    public List<String> getSongList() {
        return songList;
    }
}
