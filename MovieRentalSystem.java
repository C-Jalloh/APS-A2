import java.util.ArrayList;

public class MovieRentalSystem {

    /**
     * Represents a list of all movies in the system.
     */
    private ArrayList<Movie> movies;

    /**
     * Represents a list of all registered customers in the system.
     */
    private ArrayList<Customer> customers;

    /**
     * Constructs a new MovieRentalSystem object, initializing the movies and customers lists.
     */
    public MovieRentalSystem() {
        movies = new ArrayList<>();
        customers = new ArrayList<>();
    }

    /**
     * Adds a movie to the system, checking for duplicates and handling potential exceptions.
     *
     * @param movie The movie to add.
     * @throws IllegalArgumentException if the movie already exists.
     */
    public void addMovie(Movie movie) {
        if (movies.contains(movie)) {
            throw new IllegalArgumentException("Movie already exists: " + movie.getTitle());
        }
        movies.add(movie);
    }

    /**
     * Registers a new customer in the system, checking for duplicates and handling potential exceptions.
     *
     * @param customer The customer to register.
     * @throws IllegalArgumentException if the customer already exists.
     */
    public void registerCustomer(Customer customer) {
        if (customers.contains(customer)) {
            throw new IllegalArgumentException("Customer already exists: " + customer.getName());
        }
        customers.add(customer);
    }

    /**
     * Searches for a movie by its title.
     *
     * @param title The title of the movie to search for.
     * @return The Movie object if found, null otherwise.
     */
    public Movie searchMovieByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * Searches for movies by their genre.
     *
     * @param genre The genre to search for.
     * @return A list of movies that match the specified genre.
     */
    public ArrayList<Movie> searchMoviesByGenre(Genre genre) {
        ArrayList<Movie> genreMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().equals(genre)) {
                genreMovies.add(movie);
            }
        }
        return genreMovies;
    }

    /**
     * Displays a list of all available movies in the system.
     */
    public void displayAvailableMovies() {
        System.out.println("Available Movies:");
        for (Movie movie : movies) {
            if (movie.isAvailable()) {
                System.out.println(movie);
            }
        }
    }

    /**
     * Displays a list of all registered customers in the system.
     */
    public void displayCustomers() {
        System.out.println("Customers: { ");
        for (Customer customer : customers) {
            System.out.println("\t " + customer.getName());
        }
        System.out.println("\t }");
    }

    /**
     * Searches for a customer by their name.
     *
     * @param name The name of the customer to search for.
     * @return The Customer object if found, null otherwise.
     */
    public Customer getCustomerByName(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}