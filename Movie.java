public class Movie {

    private String title;
    private  Genre genre;
    private int releaseYear;
    private boolean isAvailable;

    private enum GENRE {
        ACTION,
        COMEDY,
        DRAMA,
        HORROR,
        SCI_FI,
        ROMANCE,
        DOCUMENTARY,
    }


    public Movie(String title, Genre genre, int releaseYear){
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.isAvailable = true;
    }


    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public  void rentMovie( ){
        this.isAvailable = false;
    }

    public void returnMovie(){
        this.isAvailable = true;

    }

    @Override
    public String toString() {
        return "Movie{ " + "\ttitle = " + this.title + ",\n\t\tgenre = " + this.genre + ",\n\t\treleaseYear = " + this.releaseYear + ",\n\t\tisAvailable = " + isAvailable + "\n\t}";
    }
}
