package org.example;

public class IPhone implements Phone {
  private boolean on = false;
  private Battery battery;
  public static Screen screen;
  public static Processor processor;
  public static IOS iOS = new IOS();

  public IPhone() {
    powerOn();
    battery.charge(0);
    screen = new Screen();
    processor = new Processor();
  }

  public void powerOn() {
    this.on = true;
  }

  public void powerOff() {
    this.on = false;
  }

  public void charge(int amount) {
    battery.charge(amount);
  }

  public void display() {
    screen.display();
  }
}
