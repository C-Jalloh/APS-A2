import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        MovieRentalSystem movieRentalSystem = new MovieRentalSystem();
        Movie movie1 = new Movie("Legend of Vox Machina", Genre.ACTION, 2022);
        Movie movie2 = new Movie("House of The Dragon", Genre.DRAMA, 2021);
        Movie movie3 = new Movie("SuperFly", Genre.DOCUMENTARY, 2019);
        Movie movie4 = new Movie("Rick and Monty", Genre.SCI_FI, 2014);
        Movie movie5 = new Movie("Tokyo Ghoul", Genre.HORROR, 2017);
        Movie movie6 = new Movie("Naruto", Genre.ROMANCE, 2007);

        Customer ebrima = new Customer("Ebrima");
        Customer tijan = new Customer("Tijan");
        Customer mama = new Customer("Mama");
        Customer doo = new Customer("Doo");
        Customer saiksay = new Customer("Saiksay");
        Customer sanu = new Customer("Sanu");
        Customer alp = new Customer("alp");


        movieRentalSystem.addMovie(movie1);
        movieRentalSystem.addMovie(movie2);
        movieRentalSystem.addMovie(movie3);
        movieRentalSystem.addMovie(movie4);
        movieRentalSystem.addMovie(movie5);
        movieRentalSystem.addMovie(movie6);

        movieRentalSystem.registerCustomer(ebrima);
        movieRentalSystem.registerCustomer(tijan);
        movieRentalSystem.registerCustomer(mama);
        movieRentalSystem.registerCustomer(doo);
        movieRentalSystem.registerCustomer(saiksay);
        movieRentalSystem.registerCustomer(sanu);
        movieRentalSystem.registerCustomer(alp);


        //movieRentalSystem.displayAvailableMovies();
        //movieRentalSystem.displayCustomers();
//        String movieByTitle = movieRentalSystem.searchMovieByTitle("Legend of Vox Machina");
//        System.out.println(movieByTitle);
//        ArrayList<Movie> horrorMovies = movieRentalSystem.searchMoviesByGenre(Genre.HORROR);

//        for(Movie movie : horrorMovies) {
//            System.out.println(movie.toString());
//        }
       ebrima.rentMovie(movie1);
       ebrima.returnMovie(movie1);
       ebrima.listRentedMovies();
//        System.out.println(movie1.toString());
      System.out.println( movie1.isAvailable());
    }
}
