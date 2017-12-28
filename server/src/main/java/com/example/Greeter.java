package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * This method sends greetings.
  * @param someone who gets greetings.
  * @return the greeting.
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
