public class Movie {

    /**
     * Represents the title of the movie.
     */
    private String title;

    /**
     * Represents the genre of the movie.
     */
    private Genre genre;

    /**
     * Represents the release year of the movie.
     */
    private int releaseYear;

    /**
     * Indicates whether the movie is currently available for rent.
     */
    private boolean isAvailable;

    /**
     * Constructs a new Movie object with the specified title, genre, and release year.
     *
     * @param title The title of the movie.
     * @param genre The genre of the movie.
     * @param releaseYear The release year of the movie.
     */
    public Movie(String title, Genre genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    /**
     * Rents the movie, marking it as unavailable.
     */
    public void rentMovie() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " is rented.");
        } else {
            System.out.println(title + " is already rented.");
        }
    }

    /**
     * Returns the movie, marking it as available.
     */
    public void returnMovie() {
        isAvailable = true;
        System.out.println(title + " is returned.");
    }

    /**
     * Returns a string representation of the movie, including its title, genre, release year, and availability status.
     *
     * @return A string representation of the movie.
     */
    @Override
    public String toString() {
        return "Movie{ " + "\ttitle = " + this.title + ",\n\t\tgenre = " + this.genre + ",\n\t\treleaseYear = " + this.releaseYear + ",\n\t\tisAvailable = " + isAvailable + "\n\t}";
    }

}