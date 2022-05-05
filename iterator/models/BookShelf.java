package iterator.models;

import java.util.ArrayList;
import java.util.List;

import iterator.interfaces.Aggregate;
import iterator.interfaces.Iterator;

public class BookShelf implements Aggregate {
  private List<Book> books;
  private int last = 0;

  public BookShelf(int maxsize) {
    this.books = new ArrayList<>(maxsize);
  }

  public Book getBookAt(int index) {
    return books.get(index);
  }

  public void appendBook(Book book) {
    this.books.add(book);
    last++;
  }

  public int getLength() {
    return this.last;
  }

  public Iterator iterator() {
    return new BookShelfIterator(this);
  }
}
