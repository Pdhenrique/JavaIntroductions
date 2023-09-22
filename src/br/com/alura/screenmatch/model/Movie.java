public class Movie {
  String name;
  int ReleaseYear;
  boolean includeInPlan;
  private double ReviewSum;
  private int totalReviews;
  int movieDuration;

  int getTotalReviews(){
    return totalReviews;
  }

  void displayTechnicalSheet() {
    System.out.println(name);
    System.out.println(ReleaseYear);
  };

  void rateMovie(double note ) {
    ReviewSum += note;
    totalReviews ++;
  }

  double averageReview(){
   return ReviewSum / totalReviews;
  }

}
