package adapter.banners;

public class Banner {
  private String string;

  public Banner(String string) {
    this.string = string;
  }

  public void showWithParren() {
    System.out.println("(" + string + ")");
  }

  public void showWithAster() {
    System.out.println("*" + string + "*");
  }
}
