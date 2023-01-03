import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private int id;
        private String artist;
        private String name;
        private int releaseDate;
        private String genre;
        private double sales;

        public Album() { }
//    Getters

    public Album(int id, String artist, String name, int releaseDate, String genre, double sales) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.sales = sales;
    }

    public int getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public double getSales() {
        return sales;
    }


//    Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleasedate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }


    }

