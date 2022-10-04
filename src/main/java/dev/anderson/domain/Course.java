package dev.anderson.domain;

public class Course extends Content {

  private int workload;

  public Course() {
  }

  @Override
  public double calculateXp() {
    return DEFAULT_XP * workload;
  }

  public int getWorkload() {
    return workload;
  }

  public void setWorkload(int workload) {
    this.workload = workload;
  }

  @Override
  public String toString() {
    return "Course { " +
        " workload = " + getTitle() +
        " description = " + getDescription() +
        " workload = " + workload +
        '}';
  }
}
