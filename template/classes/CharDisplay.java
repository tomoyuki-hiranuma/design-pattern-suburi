package template.classes;

public class CharDisplay extends AbstractDisplay {
  private char chr;

  public CharDisplay(char chr) {
    this.chr = chr;
  }

  public void open() {
    System.out.print("<<");
  }

  public void print() {
    System.out.print(chr);
  }

  public void close() {
    System.out.print(">>\n");
  }
}
