package ru.khismatullin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songList = new ArrayList<>();

    @Autowired
    private ClassicalMusic() {
        songList.add("Toccata and Fugue in D minor");
        songList.add("Nocturne No. 2 in E flat Major");
        songList.add("Moonlight Sonata");
    }
    @Override
    public List<String> getSongList() {
        return songList;
    }
}
