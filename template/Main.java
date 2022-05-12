package template;

import template.classes.AbstractDisplay;
import template.classes.CharDisplay;
import template.classes.StringDisplay;

public class Main {
  public static void main(String[] args) {
    AbstractDisplay charDisplay = new CharDisplay('H');
    charDisplay.display();

    AbstractDisplay stringDisplay = new StringDisplay("Hello, world.");
    stringDisplay.display();
  }
}
