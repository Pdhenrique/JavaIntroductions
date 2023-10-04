import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Series;

public class main {
  public static void main(String[] args) {
    Movie newMovie = new Movie();
    Series newSeries = new Series();

//    newMovie.setName("Harry-Potter e a câmara secreta");
//    newMovie.setReleaseYear(2002);
//    newMovie.setMovieDuration(161);
//    newMovie.displayTechnicalSheet();
//    newMovie.rateMovie(8);
//    newMovie.rateMovie(6);
//    newMovie.rateMovie(7);
//    System.out.println("total de avaliações: " + newMovie.getTotalReviews());
//    System.out.println(newMovie.averageReview());

    newSeries.setName("Lost");

    newSeries.setSeason(10);
    newSeries.displayTechnicalSheet();
    newSeries.setEpsForSeason(10);
    newSeries.setMinutesPerEpisode(47);

    System.out.println(newSeries.getMovieDuration());

  }
}
