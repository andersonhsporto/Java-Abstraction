package dev.anderson.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

  private final LocalDate startDate;
  private final LocalDate endDate;
  private String name;
  private String description;

  private Set<Dev> devs;
  private Set<Content> content;

  public Bootcamp(String name, String description) {
    this.name = name;
    this.description = description;
    this.startDate = LocalDate.now();
    this.endDate = LocalDate.now().plusDays(45);
    this.devs = new HashSet<>();
    this.content = new LinkedHashSet<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }


  public Set<Dev> getDevs() {
    return devs;
  }

  public void setDevs(Set<Dev> devs) {
    this.devs = devs;
  }

  public Set<Content> getContent() {
    return content;
  }

  public void setContent(Set<Content> content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bootcamp bootcamp = (Bootcamp) o;
    return Objects.equals(name, bootcamp.name) && Objects.equals(description,
        bootcamp.description) && Objects.equals(startDate, bootcamp.startDate)
        && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(
        devs, bootcamp.devs) && Objects.equals(content, bootcamp.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, startDate, endDate, devs, content);
  }
}
