package adapter.banners;

import adapter.classes.Print;

// import adapter.interfaces.Print;

// public class PrintBanner extends Banner implements Print {
//   public PrintBanner(String string) {
//     super(string);
//   }

//   public void printWeak() {
//     showWithParren();
//   }

//   public void printStrong() {
//     showWithAster();
//   }
// }

public class PrintBanner extends Print {
  private Banner banner;

  public PrintBanner(String string) {
    this.banner = new Banner(string);
  }

  public void printWeak() {
    banner.showWithParren();
  }

  public void printStrong() {
    banner.showWithAster();
  }
}
