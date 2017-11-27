package model.entity;

import java.util.*;

public class Albums {

    private String name;
    private List<Music> musics = new ArrayList<>();
    private int year;


    public Albums(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public boolean addMusic(Music music) {
        return musics.add(music);
    }

    public List<Music> getMusics() {
        return Collections.unmodifiableList(musics);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Альбом: " + name;
    }
}
