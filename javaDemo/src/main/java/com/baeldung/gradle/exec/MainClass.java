package com.baeldung.gradle.exec;

public class MainClass {

  /**
   * ./gradlew run --args="lorem ipsum dolor"
   *
   * @param args args
   */
  public static void main(String[] args) {
    System.out.println("Gradle command line arguments example");

    for (String arg : args) {
      System.out.println("Got argument [" + arg + "]");
    }
  }
}
