package service;

import model.entity.Albums;
import model.entity.Disc;
import model.entity.Music;

import java.util.ArrayList;
import java.util.List;

public class DiscManager {
    private Disc disc;

    public DiscManager(Disc disc) {
        this.disc = disc;
    }

    public List getAlbums () {
        return disc.getAlbums();
    }

    public String getTotalDuration() {
        int sec = 0;
        for (Albums albums : disc.getAlbums()) {
            for (Music music : albums.getMusics()) {
                sec+= music.getDuration();
            }
        }
        StringBuilder sb = new StringBuilder();
        int h = sec / 3600;
        int m = (sec - h * 3600) / 60;
        int s = sec - m * 60 - h * 3600;

        sb.append(h).append(":").append(m).append(":").append(s).append("\n");

        return sb.toString();
    }

    public String sortByStyleAndGet() {
        List<Music> musics = new ArrayList<>();

        for (Albums albums : disc.getAlbums()) {
            musics.addAll(albums.getMusics());
        }

        musics.sort((o1,o2)->o1.getStyle().toString().compareTo(o2.getStyle().toString()));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < musics.size(); i++) {
            sb.append(i + 1).append(". ").append(musics.get(i).getName()).append(" ").append(musics.get(i).getStyle()).append("\n");
        }

        return sb.toString();
    }

    public String getMusicsBetweenDuration(String line) {
        int x = Integer.parseInt(line.split("-")[0]);
        int y = Integer.parseInt(line.split("-")[1]);
        List<Music> musics = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (Albums albums : disc.getAlbums()) {
            musics.addAll(albums.getMusics());
        }

        for (int i = 0; i < musics.size(); i++) {
            if(musics.get(i).getDuration() >= x && musics.get(i).getDuration() <= y )
            sb.append(i + 1).append(". ").append(musics.get(i).getName()).append(" ").append(musics.get(i).getStyle()).append("\n");
        }

        return sb.toString();
    }
}
