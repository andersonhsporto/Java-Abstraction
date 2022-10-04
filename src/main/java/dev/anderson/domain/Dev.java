package dev.anderson.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

  private String name;
  private Set<Content> contentsSubscribed;
  private Set<Content> contentsCompleted;

  public Dev(String name) {
    this.name = name;
    this.contentsSubscribed = new LinkedHashSet<>();
    this.contentsCompleted = new LinkedHashSet<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Content> getContentsSubscribed() {
    return contentsSubscribed;
  }

  public void setContentsSubscribed(Set<Content> contentsSubscribed) {
    this.contentsSubscribed = contentsSubscribed;
  }

  public Set<Content> getContentsCompleted() {
    return contentsCompleted;
  }

  public void setContentsCompleted(Set<Content> contentsCompleted) {
    this.contentsCompleted = contentsCompleted;
  }

  public void subscribe(Bootcamp bootcamp) {
    this.contentsSubscribed.addAll(bootcamp.getContent());
    bootcamp.getDevs().add(this);
  }

  public void progress() {
    var content = this.contentsSubscribed.stream().findFirst();

    if (content.isPresent()) {
      this.contentsCompleted.add(content.get());
      this.contentsSubscribed.remove(content.get());
    } else {
      System.out.println("No content to progress");
    }
  }

  public double calculateXp() {
    return this.contentsCompleted.stream().mapToDouble(Content::calculateXp).sum();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dev dev = (Dev) o;
    return Objects.equals(name, dev.name) && Objects.equals(contentsSubscribed,
        dev.contentsSubscribed) && Objects.equals(contentsCompleted, dev.contentsCompleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contentsSubscribed, contentsCompleted);
  }
}
