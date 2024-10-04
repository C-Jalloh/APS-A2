import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Movie> rentedMovies;

    public Customer(String name) {

        this.name = name;
        this.rentedMovies = new ArrayList<>();
    }

    public void rentMovie(Movie movie) {
        if (movie.isAvailable()){
        rentedMovies.add(movie);
        movie.rentMovie();
        }else {
            System.out.println("This Movie is not available");
        }
    }
    public void returnMovie(Movie movie) {
        rentedMovies.remove(movie);
        movie.returnMovie();

    }

    public void listRentedMovies() {
        for(Movie movie : rentedMovies) {
            System.out.println(movie.getTitle());
        }
    }

    public String getName() {
        return name;
    }
}
