import java.util.ArrayList;

public class Customer {

    /**
     * Represents the name of the customer.
     */
    private String name;

    /**
     * Represents a list of movies currently rented by the customer.
     */
    private ArrayList<Movie> rentedMovies;

    /**
     * Constructs a new Customer object with the specified name.
     *
     * @param name The name of the customer.
     */
    public Customer(String name) {
        this.name = name;
        rentedMovies = new ArrayList<>();
    }

    /**
     * Rents a movie if it's available. Adds the movie to the customer's rented list and marks it as rented in the Movie object.
     *
     * @param movie The movie to rent.
     */
    public void rentMovie(Movie movie) {
        if (movie.isAvailable()) {
            rentedMovies.add(movie);
            movie.rentMovie();
            System.out.println("\n\t" + movie.getTitle() + " is rented by " + this.name +"\n");
        } else {
            System.out.println("\t" + movie.getTitle()  + "is not available\n ");

        }
    }

    /**
     * Returns a rented movie. Removes the movie from the customer's rented list and marks it as available in the Movie object.
     *
     * @param movie The movie to return.
     */
    public void returnMovie(Movie movie) {
        rentedMovies.remove(movie);
        movie.returnMovie();
        System.out.println( "\tby " + this.name +"\n");
    }

    /**
     * Lists all movies currently rented by the customer by printing their titles.
     */
    public void listRentedMovies() {
        for (Movie movie : rentedMovies) {
            System.out.println(movie.toString());
        }
    }

    /**
     * Gets the name of the customer.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }
}