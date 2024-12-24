package com.baeldung.gradle.exec

class MainKotlinClass {

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      // this is to test kotlin works.

      println("Gradle command line arguments kotlin example.")
      for (arg in args) {
        println("Got argument [$arg]")
      }
    }
  }
}
