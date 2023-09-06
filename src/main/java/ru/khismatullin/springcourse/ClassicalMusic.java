package ru.khismatullin.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Toccata and Fugue in D minor";
    }
}
