package model.entity;

import java.util.*;

public class Disc {
    private String name;
    private Date dateOfCreation;
    private List<Albums> albums;

    public Disc(String name) {
        this.name = name;
        this.dateOfCreation = new Date();
        albums = new ArrayList<>();
    }

    public boolean addAlbum(Albums albums) {
        return this.albums.add(albums);
    }

    public void addAllAlbums(Albums... albums) {
        this.albums.addAll(Arrays.asList(albums));
    }

    public List<Albums> getAlbums() {
        return Collections.unmodifiableList(albums);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return name;
    }
}
