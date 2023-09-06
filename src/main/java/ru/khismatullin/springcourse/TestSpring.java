package ru.khismatullin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestSpring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите музыкальный жанр (1 - classical, 2 -jazz): ");
        int i = scanner.nextInt();

        System.out.println(i);

        MusicGenre musicGenre;
        switch (i) {
            case 1 : musicGenre = MusicGenre.CLASSICAL; break;
            case 2 : musicGenre = MusicGenre.JAZZ; break;
            default: System.out.println("Неправильный выбор! Значит джаз!"); musicGenre = MusicGenre.JAZZ;
        }

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(musicGenre));

        context.close();
    }
}
