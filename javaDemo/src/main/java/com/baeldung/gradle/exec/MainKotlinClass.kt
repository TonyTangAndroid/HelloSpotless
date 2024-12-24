package com.baeldung.gradle.exec

class MainKotlinClass {

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      println("Gradle command line arguments " +
          "kotlin example")
      for (arg in args) {




        println("Got argument [$arg]")
      }
    }
  }
}