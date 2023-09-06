package ru.khismatullin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music jazzMusic = context.getBean("jazzMusic", Music.class);
        MusicPlayer jazzMusicPlayer = new MusicPlayer(jazzMusic);
        jazzMusicPlayer.playMusic();

        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
        classicalMusicPlayer.playMusic();

        context.close();
    }
}
