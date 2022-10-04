package dev.anderson.domain;

import java.time.LocalDate;

public class Mentorship extends Content {

  private LocalDate date;

  public Mentorship() {
  }

  @Override
  public double calculateXp() {
    return DEFAULT_XP + 20d;
  }


  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Mentorship{" +
        "date=" + date +
        "title=" + getTitle() +
        "description=" + getDescription() +
        '}';
  }
}
