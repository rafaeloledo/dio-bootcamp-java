package org.example;

public class Battery {
  private int capacity;

  public Battery() {
    this.capacity = 0;
  }

  public void charge(int amount) {
    this.capacity += amount;
  }

  public int getLevel() {
    return this.capacity;
  }
}
