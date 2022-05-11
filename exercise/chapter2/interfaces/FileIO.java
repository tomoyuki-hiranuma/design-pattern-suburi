package exercise.chapter2.interfaces;

import java.io.IOException;

public interface FileIO {
  abstract public void readFromFile(String filename) throws IOException;

  abstract public void writeToFile(String filename) throws IOException;

  abstract public void setValue(String key, String value);

  abstract public String getValue(String key);
}
