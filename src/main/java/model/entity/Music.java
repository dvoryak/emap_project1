package model.entity;

public class Music {

    private String name;
    private String author;
    private int year;
    private int duration;
    private Style style;

    public Music() {
    }

    public Music(String name, String author, int year, int duration, Style style) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.duration = duration;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(5);
        sb.append("Name: ").append(name).append(" author: ").append(author).append(" duration: ")
                .append(duration).append(" year").append(year).append(" style").append(style.name());
        return sb.toString();
    }
}
