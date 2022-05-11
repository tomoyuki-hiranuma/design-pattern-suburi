package adapter;

import adapter.banners.PrintBanner;
import adapter.classes.Print;

// import adapter.banners.PrintBanner;
// import adapter.interfaces.Print;

public class Main {
  public static void main(String[] args) {
    // Print p = new PrintBanner("Hello");
    // p.printWeak();
    // p.printStrong();
    Print p = new PrintBanner("Hello");
    p.printWeak();
    p.printStrong();
  }
}
