import java.util.ArrayList;

public class MovieRentalSystem {
    private ArrayList<Movie> movies;
    private ArrayList<Customer> customers;

    public MovieRentalSystem() {
        movies = new ArrayList<>();
        customers = new ArrayList<>();
    }


    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public String searchMovieByTitle(String title) {
        for(Movie movie : movies) {
            if(movie.getTitle().equals(title)) {
                return movie.toString();
            }
        }
        return null;
    }

    public ArrayList<Movie> searchMoviesByGenre(Genre genre) {
        ArrayList<Movie> genreMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().equals(genre)) {
                genreMovies.add(movie);
            }
        }
        return genreMovies;
    }
    public void displayAvailableMovies() {
        for(Movie movie : movies) {
            if (movie.isAvailable()){
            System.out.println("\t "+movie.getTitle());
        }
        }
    }

    public void displayCustomers() {
        System.out.println("Customers: { ");
        for (Customer customer : customers) {
            System.out.println("\t "+customer.getName());
        }
        System.out.println("\t }");
    }


public Customer getCustomerByName(String name){
        for(Customer s : customers){
            if (s.getName().equals(name)){
    return s;
            }
        }
        return null;
}














}
