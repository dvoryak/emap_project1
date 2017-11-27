package model;

import model.entity.Albums;
import model.entity.Music;
import model.entity.Style;

import java.util.ArrayList;

public enum DataBaseAlbums {
    INSTANCE;

    private ArrayList<Albums> albums = new ArrayList<>();

    {
        Albums albums = new Albums("Oxxxymiron - Вечный жид", 2011);
        albums.addMusic(new Music("Восточный Мордор","Oxxxymiron",2011,300, Style.RAP));
        albums.addMusic(new Music("До сих пор МС","Oxxxymiron",2010,345, Style.RAP));
        albums.addMusic(new Music("CCTV","Oxxxymiron",2011,400, Style.RAP));
        this.albums.add(albums);

        albums = new Albums("Oxxxymiron -  ГОРГОРОД", 2015);
        albums.addMusic(new Music("Полигон","Oxxxymiron",2013,313, Style.RAP));
        albums.addMusic(new Music("Где нас нет","Oxxxymiron",2014,345, Style.ROCK));
        albums.addMusic(new Music("Накануне","Oxxxymiron",2015,320, Style.CLASSIC));
        this.albums.add(albums);

        albums = new Albums("Hollywood Undead - FIVE ", 2017);
        albums.addMusic(new Music("California Dreaming","Hollywood Undead",2017,410, Style.ROCK));
        albums.addMusic(new Music("Whatever It Takes","Hollywood Undead",2016,270, Style.ROCK));
        albums.addMusic(new Music("Bad Moon","Hollywood Undead",2017,180, Style.CLASSIC));
        albums.addMusic(new Music("We Own The Night","Hollywood Undead",2017,230, Style.CLASSIC));
        this.albums.add(albums);

        albums = new Albums("Deuce - Nine Lives", 2012);
        albums.addMusic(new Music("Help Me","Deuce",2011,510, Style.JAS));
        albums.addMusic(new Music("America","Deuce",2009,180, Style.POP));
        albums.addMusic(new Music("Walk Alone","Deuce",2011,410, Style.CLASSIC));
        albums.addMusic(new Music("Now you see my life","Deuce",2012,330, Style.RAP));
        this.albums.add(albums);

    }

    public boolean addAlbum(Albums albums) {
        return this.albums.add(albums);
    }

    public ArrayList<Albums> getAllAlbums() {
        return albums;
    }

    public Albums getAlbum(int index) {
        return albums.get(index);
    }


}
