package br.com.alura.screenmatch.model;

public class Title {
  private String name;
  private int ReleaseYear;
  private boolean includeInPlan;
  private double ReviewSum;
  private int totalReviews;
  private int movieDuration;

  public int getTotalReviews(){
    return totalReviews;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setReleaseYear(int releaseYear) {
    ReleaseYear = releaseYear;
  }

  public void setIncludeInPlan(boolean includeInPlan) {
    this.includeInPlan = includeInPlan;
  }

  public void setMovieDuration(int movieDuration) {
    this.movieDuration = movieDuration;
  }

  public String getName() {
    return name;
  }

  public int getReleaseYear() {
    return ReleaseYear;
  }

  public boolean isIncludeInPlan() {
    return includeInPlan;
  }

  public int getMovieDuration() {
    return movieDuration;
  }

  public void displayTechnicalSheet() {
    System.out.println(name);
    System.out.println(ReleaseYear);
  };

  public void rateMovie(double note ) {
    ReviewSum += note;
    totalReviews ++;
  }

  public double averageReview(){
    return ReviewSum / totalReviews;
  }
}
