public class main {
  public static void main(String[] args) {
    Movie newMovie = new Movie();

    newMovie.name = "Harry-Potter e a câmara secreta";
    newMovie.ReleaseYear = 2002;
    newMovie.movieDuration = 161;
    newMovie.review = 82;
    newMovie.totalReviews = 237;

    System.out.println(newMovie);
  }
}
