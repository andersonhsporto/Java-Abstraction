package dev.anderson;

import dev.anderson.domain.Bootcamp;
import dev.anderson.domain.Course;
import dev.anderson.domain.Dev;
import dev.anderson.domain.Mentorship;
import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    Course course1 = new Course();
    course1.setTitle("Java");
    course1.setDescription("Java course");
    course1.setWorkload(8);

    Course course2 = new Course();
    course2.setTitle("Python");
    course2.setDescription("Python course");
    course2.setWorkload(4);

    Mentorship mentorship = new Mentorship();
    mentorship.setTitle("Mentorship");
    mentorship.setDescription("Mentorship course");
    mentorship.setDate(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp("Java Developer", "Java Developer Bootcamp");
    bootcamp.getContent().add(course1);
    bootcamp.getContent().add(course2);
    bootcamp.getContent().add(mentorship);

    Dev anderson = new Dev("Anderson");
    anderson.subscribe(bootcamp);
    System.out.println("Contents subscribed: " + anderson.getContentsSubscribed());
    anderson.progress();
    anderson.progress();
    System.out.println("______");
    System.out.println("Contents subscribed: " + anderson.getContentsSubscribed());
    System.out.println("Contents completed: " + anderson.getContentsCompleted());
    System.out.println("Xp: " + anderson.calculateXp());
    System.out.println("______");

    Dev Higo = new Dev("Higo");
    Higo.subscribe(bootcamp);
    System.out.println("Contents subscribed: " + Higo.getContentsSubscribed());
    Higo.progress();
    Higo.progress();
    System.out.println("______");
    System.out.println("Contents subscribed: " + Higo.getContentsSubscribed());
    System.out.println("Contents completed: " + Higo.getContentsCompleted());
    System.out.println("Xp: " + Higo.calculateXp());

  }
}