package br.com.alura.screenmatch.model;

public class Series extends Title {
  private boolean active;
  private int season;
  private int epsForSeason;
  private int minutesPerEpisode;

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public int getSeason() {
    return season;
  }

  public void setSeason(int season) {
    this.season = season;
  }

  public int getEpsForSeason() {
    return epsForSeason;
  }

  public void setEpsForSeason(int epsForSeason) {
    this.epsForSeason = epsForSeason;
  }

  public int getMinutesPerEpisode() {
    return minutesPerEpisode;
  }

  public void setMinutesPerEpisode(int minutesPerEpisode) {
    this.minutesPerEpisode = minutesPerEpisode;
  }

  @Override
  public int getMovieDuration() {
    return season * epsForSeason * minutesPerEpisode;
  }
}
