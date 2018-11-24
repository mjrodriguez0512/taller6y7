package co.edu.konradlorenz.cardview;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Album {
    private String name;
    private int numOfSongs;
    private int thumbnail;
    private int cont;

    public Album() {
    }

    public Album(String name, int numOfSongs, int thumbnail,int cont) {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
        this.cont=cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
