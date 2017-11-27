package model;

import model.entity.Disc;

import java.util.ArrayList;
import java.util.List;

public enum  DataBaseDiscs {
    INSTANCE;

    private ArrayList<Disc> data = new ArrayList<>();

    private DataBaseAlbums albums = DataBaseAlbums.INSTANCE;

    {
        Disc disc = new Disc("disk1");
        disc.addAlbum(albums.getAlbum(0));
        data.add(disc);
    }

    public void addDisc(Disc disc) {
        data.add(disc);
    }

    public List<Disc> getAllDiscs() {
        return data;
    }
}
